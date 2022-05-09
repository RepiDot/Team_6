package tetris;

import java.awt.Graphics;

public class Board implements Images {
	private int boardX;
	private int boardY;
	
	public void drawBoard(Graphics g) {
		boardX = 710;
		boardY = 40;
		
		for(int i=0; i<20; i++) {
			for(int j=0; j<5; j++) {
				if(i % 2 == 0) {
					g.drawImage(Images.BOARD_LIGHT, boardX, boardY, null);
					g.drawImage(Images.BOARD_DARK, boardX + 50, boardY, null);
				} else {
					g.drawImage(Images.BOARD_DARK, boardX, boardY, null);
					g.drawImage(Images.BOARD_LIGHT, boardX + 50, boardY, null);
				}
				boardX += 100;
			}
			boardX = 710;
			boardY += 50;
		}
	}
	
	public void drawBoard(Graphics g, int startX, int startY, int width, int height) {
		boardX = startX;
		boardY = startY;
		
		width /= 2;
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				if(i % 2 == 0) {
					g.drawImage(Images.BOARD_LIGHT, boardX, boardY, null);
					g.drawImage(Images.BOARD_DARK, boardX + 50, boardY, null);
				} else {
					g.drawImage(Images.BOARD_DARK, boardX, boardY, null);
					g.drawImage(Images.BOARD_LIGHT, boardX + 50, boardY, null);
				}
				boardX += 100;
			}
			boardX = startX;
			boardY += 50;
		}
	}
}
