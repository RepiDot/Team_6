package tetris;

import java.awt.Graphics;

public class StackedBlock implements Images {
	String color = "0";
	int x;
	int y;
	
	public StackedBlock(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void addStackedBlock(String color) {
		this.color = color;
	}
	
	public void drawStackedBlock(Graphics g) {
		switch(color) {
		case "0":		break;
		case "red":		g.drawImage(Images.blockRedImage, x, y, null);			break;
		case "orange":	g.drawImage(Images.blockOrangeImage, x, y, null); 		break;
		case "yellow":	g.drawImage(Images.blockYellowImage, x, y, null);		break;
		case "green":	g.drawImage(Images.blockGreenImage, x, y, null);		break;
		case "cyan":	g.drawImage(Images.blockCyanImage, x, y, null);			break;
		case "blue":	g.drawImage(Images.blockBlueImage, x, y, null);			break;
		case "purple":	g.drawImage(Images.blockPurpleImage, x, y, null);		break;
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
