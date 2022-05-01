package tetris;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Block implements Images {
	private int blockNum;
	private BlockData[] blockData;
	private int blockX;
	private int blockY;
	private int blockType = 0;
	
	private String color;
	
	private BlockCase blockCase = new BlockCase();
	private StackedBlock[][] stBlock = new StackedBlock[20][10];
	
	public Block() {
		blockNum = 4;
		blockData = new BlockData[blockNum];
		changeBlock();
		for(int y=0; y<20; y++) {
			for(int x=0; x<10; x++) {
				stBlock[y][x] = new StackedBlock((x * 50 + 710), (y * 50 + 40));
				System.out.println("x = " + stBlock[y][x].getX() + ", y = " + stBlock[y][x].getY());
			}
		}
	}
	
	public void drawBlock(Graphics g) {
		blockCase.setting(blockX, blockY, blockData);
		switch(blockType) {
		case 0: blockCase.blockCase_0(color); 	break;
		case 1: blockCase.blockCase_1(color); 	break;
		case 2: blockCase.blockCase_2(color);	break;
		case 3: blockCase.blockCase_3(color);	break;
		}
		
		switch(color) {
		case "red":		
			for(int i=0; i<blockNum; i++)	g.drawImage(blockRedImage, blockData[i].getX(), blockData[i].getY(), null);
			break;
		case "orange":
			for(int i=0; i<blockNum; i++)	g.drawImage(blockOrangeImage, blockData[i].getX(), blockData[i].getY(), null);
			break;
		case "yellow":	
			for(int i=0; i<blockNum; i++)	g.drawImage(blockYellowImage, blockData[i].getX(), blockData[i].getY(), null);
			break;
		case "green":
			for(int i=0; i<blockNum; i++) 	g.drawImage(blockGreenImage, blockData[i].getX(), blockData[i].getY(), null);
			break;
		case "cyan":
			for(int i=0; i<blockNum; i++) 	g.drawImage(blockCyanImage, blockData[i].getX(), blockData[i].getY(), null);
			break;
		case "blue":	
			for(int i=0; i<blockNum; i++) 	g.drawImage(blockBlueImage, blockData[i].getX(), blockData[i].getY(), null);
			break;
		case "purple":
			for(int i=0; i<blockNum; i++) 	g.drawImage(blockPurpleImage, blockData[i].getX(), blockData[i].getY(), null);
			break;
		}
	}
	
	private void changeBlock() {
		blockX = 960;
		blockY = 90;
		blockType = 0;
		int num = (int)(Math.random() * 7);
		switch(num) {
		case(0):	color = "red";		break;
		case(1):	color = "orange";	break;
		case(2):	color = "yellow";	break;
		case(3):	color = "green";	break;
		case(4):	color = "cyan";		break;
		case(5):	color = "blue";		break;
		case(6):	color = "purple";	break;
		}
	}
	
	private boolean isOkayToMove(KeyEvent e) {
		boolean okay = true;
		for(int i=0; i<blockNum; i++) {
			if(e.getKeyCode() == 40) {
				okay = okay && blockData[i].getY() != 990;
			} else if(e.getKeyCode() == 39) {
				okay = okay && blockData[i].getX() != 1160;
			} else if(e.getKeyCode() == 37) {
				okay = okay && blockData[i].getX() != 710;
			}
		}
		return okay;
	}
	
	private boolean isOkayToTurn() {
		BlockData[] nextBlock = new BlockData[blockNum];
		BlockCase nextBlockCase = new BlockCase();
		int nextType = blockType + 1;
		boolean okay = true;
		
		if(nextType == 4) {
			nextType = 0;
		}
		nextBlockCase.setting(blockX, blockY, nextBlock);
		switch(nextType) {									
		case 0: nextBlockCase.blockCase_0(color); 	break;		
		case 1: nextBlockCase.blockCase_1(color); 	break;
		case 2: nextBlockCase.blockCase_2(color);	break;
		case 3: nextBlockCase.blockCase_3(color);	break;
		}
		
		for(int i=0; i<blockNum; i++) {
			okay = okay && nextBlock[i].getX() <= 1160 && nextBlock[i].getX() >= 710
					&& nextBlock[i].getY() <= 970;
		}
		
		return okay;
	}

	public void blockKeyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == 32) {				// Key : Space / Event : Move blocks as low as possible and change block
			changeBlock();
		} else if(e.getKeyCode() == 37) {		// Key : Left / Event : Move block to the left
			if(isOkayToMove(e)) {
				blockX -= 50;
			}
		} else if(e.getKeyCode() == 38) {		// Key : Up / Event : Turn block
			if(isOkayToTurn()) {
				if(blockType != 3) {
					blockType++;
				} else {
					blockType = 0;
				}
			}
		} else if(e.getKeyCode() == 39) {		// Key : Right / Event : Move block to the right
			if(isOkayToMove(e)) {
				blockX += 50;
			}
		} else if(e.getKeyCode() == 40) {		// Key : Down / Event : Move block to the down
			if(isOkayToMove(e)) {
				blockY += 50;
			}
		}  
	}
}
