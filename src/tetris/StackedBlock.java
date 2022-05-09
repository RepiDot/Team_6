package tetris;

import java.awt.Graphics;
import java.awt.Image;

public class StackedBlock implements Images {
	Image blockImage = Images.BLOCK_EMPTY;
	int x;
	int y;
	
	public StackedBlock(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void drawStackedBlock(Graphics g) {
		if(blockImage != Images.BLOCK_EMPTY) {
			g.drawImage(blockImage, x, y, null);

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

	public Image getBlockImage() {
		return blockImage;
	}

	public void setBlockImage(Image blockImage) {
		this.blockImage = blockImage;
	}
	
}
