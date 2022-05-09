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
	private String blockColor = "0";
	
	private int color;
	private int[] priority = new int[8];
	
	private Image blockImage = Images.BLOCK_EMPTY;
	private Image locationImage = Images.BLOCK_EMPTY;
	private BlockCase blockCase = new BlockCase();
	private StackedBlock[][] stackedBlock = new StackedBlock[22][10];
	
	public Block() {
		blockNum = 4;
		blockData = new BlockData[blockNum];
		Arrays.fill(priority, 0);
		changeBlock();
		for(int y=0; y<22; y++) {
			for(int x=0; x<10; x++) {
				stackedBlock[y][x] = new StackedBlock((x * 50 + 710), (y * 50 - 60));
			}
		}
	}
	
	public void drawBlock(Graphics g) {
		blockCase.setting(blockX, blockY, blockData);
		switch(blockType) {
		case 0: blockCase.blockCase_0(blockColor); 	break;
		case 1: blockCase.blockCase_1(blockColor); 	break;
		case 2: blockCase.blockCase_2(blockColor);	break;
		case 3: blockCase.blockCase_3(blockColor);	break;
		}
		
		for(int i=0; i<blockNum; i++) {
			g.drawImage(blockImage, blockData[i].getX(), blockData[i].getY(), null);
		}
		
		for(int y=0; y<22; y++) {
			for(int x=0; x<10; x++) {
				stackedBlock[y][x].drawStackedBlock(g);
			}
		}
		
		drawDroppingLocation(g);
	}
	
	private void changeBlock() {
		blockX = 960;
		blockY = -10;
		blockType = 0;

		blockPriority();
		
		switch(color) {
		case(0):	blockImage = Images.BLOCK_RED;	locationImage = Images.LOCATION_RED;		
					blockColor = "red";		priority[1]++;	break;
		case(1):	blockImage = Images.BLOCK_ORANGE;	locationImage = Images.LOCATION_ORANGE;
					blockColor = "orange";	priority[2]++;	break;
		case(2):	blockImage = Images.BLOCK_YELLOW;	locationImage = Images.LOCATION_YELLOW;
					blockColor = "yellow";	priority[3]++;	break;
		case(3):	blockImage = Images.BLOCK_GREEN;	locationImage = Images.LOCATION_GREEN;
					blockColor = "green";	priority[4]++;	break;
		case(4):	blockImage = Images.BLOCK_CYAN;		locationImage = Images.LOCATION_CYAN;
					blockColor = "cyan";	priority[5]++;	break;
		case(5):	blockImage = Images.BLOCK_BLUE;		locationImage = Images.LOCATION_BLUE;
					blockColor = "blue";	priority[6]++;	break;
		case(6):	blockImage = Images.BLOCK_PURPLE;	locationImage = Images.LOCATION_PURPLE;
					blockColor = "purple";	priority[7]++;	break;
		}
	}
	
	private void blockPriority() {
		for(int i=1; i<8; i++) {
			if(priority[0] > priority[i]) {
				priority[0] = priority[i];
			}
		}
		
		color = (int)(Math.random() * 7);
		if(priority[0] < priority[color + 1]) {
			color = (int)(Math.random() * 7);
		}
		
	}
	
	private void stackBlock() {
		int a;
		int b;
		for(int i=0; i<blockNum; i++) {
			a = (blockData[i].getX() - 710) / 50;
			b = (blockData[i].getY() + 60) / 50;
			stackedBlock[b][a].setBlockImage(blockImage);
		}
	}
	
	private int findDroppingLocation() {
		int nextY = 50;
		outer : while(true) {
			for(int i=0; i<blockNum; i++) {
				if(blockData[i].getY() + nextY > 990
						|| isStackedBlock(blockData[i].getX(), blockData[i].getY() + nextY)) {
					break outer;
				}
			}
			nextY += 50;
		}
		nextY -= 50;
		
		return nextY;
	}
	
	private void dropBlock() {
		int nextY = findDroppingLocation();
		
		for(int i=0; i<blockNum; i++) {
			blockData[i].setY(blockData[i].getY() + nextY);
		}
		
		stackBlock();
		changeBlock();
	}
	
	private void drawDroppingLocation(Graphics g) {
		int nextY = findDroppingLocation();
		
		for(int i=0; i<blockNum; i++) {
			g.drawImage(locationImage, blockData[i].getX(), blockData[i].getY() + nextY, null);
		}
	}
	
	private boolean isAbleToMove(KeyEvent e) {
		boolean able = true;
		for(int i=0; i<blockNum; i++) {
			switch(e.getKeyCode()) {
			case 40:	able = able && blockData[i].getY() != 990;		
						able = able && !isStackedBlock(blockData[i].getX(), blockData[i].getY() + 50); break;
						
			case 39:	able = able && blockData[i].getX() != 1160;
						able = able && !isStackedBlock(blockData[i].getX() + 50, blockData[i].getY()); break;
						
			case 37:	able = able && blockData[i].getX() != 710;
						able = able && !isStackedBlock(blockData[i].getX() - 50, blockData[i].getY()); break;
			}
		}
		return able;
	}
	
	private boolean isAbleToTurn() {
		BlockData[] nextBlock = new BlockData[blockNum];
		BlockCase nextBlockCase = new BlockCase();
		int nextType = blockType + 1;
		boolean able = true;
		
		if(nextType == 4) {
			nextType = 0;
		}
		nextBlockCase.setting(blockX, blockY, nextBlock);
		switch(nextType) {									
		case 0: nextBlockCase.blockCase_0(blockColor); 	break;		
		case 1: nextBlockCase.blockCase_1(blockColor); 	break;
		case 2: nextBlockCase.blockCase_2(blockColor);	break;
		case 3: nextBlockCase.blockCase_3(blockColor);	break;
		}
		
		for(int i=0; i<blockNum; i++) {
			able = able && nextBlock[i].getX() <= 1160 && nextBlock[i].getX() >= 710
					&& nextBlock[i].getY() <= 970;
			
			able = able && !isStackedBlock(nextBlock[i].getX(), nextBlock[i].getY());
		}
		
		return able;
	}
	
	private boolean isStackedBlock(int x, int y) {
		Image blockImage;
		int a;
		int b;
		
		for(int i=0; i<blockNum; i++) {
			a = (x - 710) / 50;
			b = (y + 60) / 50;
			blockImage = stackedBlock[b][a].getBlockImage();
			
			if(blockImage != Images.BLOCK_EMPTY) {
				return true;
			}
		}
		
		return false;
	}

	public void blockKeyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getKeyCode() == 32) {				// Key : Space / Event : Teleport blocks as low as possible and change block
			dropBlock();
			
		} else if(e.getKeyCode() == 37) {		// Key : Left / Event : Move blocks to the left
			if(isAbleToMove(e)) {
				blockX -= 50;
			}
		} else if(e.getKeyCode() == 38) {		// Key : Up / Event : Turn block
			if(isAbleToTurn()) {
				if(blockType != 3) {
					blockType++;
				} else {
					blockType = 0;
				}
			}
		} else if(e.getKeyCode() == 39) {		// Key : Right / Event : Move blocks to the right
			if(isAbleToMove(e)) {
				blockX += 50;
			}
		} else if(e.getKeyCode() == 40) {		// Key : Down / Event : Move blocks to the down
			if(isAbleToMove(e)) {
				blockY += 50;
			}
		}  
	}
}
