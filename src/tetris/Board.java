package tetris;

import java.awt.Graphics;

public class Board implements Images {
	private int boardX;
	private int boardY;
	
	public void drawBoard(Graphics g, String mode) {
		boardX = 710;
		boardY = 40;
		
		for(int i=0; i<20; i++) {
			for(int j=0; j<5; j++) {
				if(i % 2 == 0) {
					g.drawImage(boardLightImage, boardX, boardY, null);
					g.drawImage(boardDarkImage, boardX + 50, boardY, null);
				} else {
					g.drawImage(boardDarkImage, boardX, boardY, null);
					g.drawImage(boardLightImage, boardX + 50, boardY, null);
				}
				boardX += 100;
			}
			boardX = 710;
			boardY += 50;
		}
	}
}