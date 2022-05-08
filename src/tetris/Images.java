package tetris;

import java.awt.Image;

import javax.swing.ImageIcon;

public interface Images {
	public final Image BACKGROUND_TETRIS = new ImageIcon(Main.class.getResource("../images/tetrisBackgroundImage.png")).getImage();;
	
	public final Image BOARD_DARK = new ImageIcon(Main.class.getResource("../images/boardDarkImage.png")).getImage();
	public final Image BOARD_LIGHT = new ImageIcon(Main.class.getResource("../images/boardLightImage.png")).getImage();
	
	public final Image BLOCK_EMPTY = new ImageIcon(Main.class.getResource("../images/blockEmptyImage.png")).getImage();
	public final Image BLOCK_RED = new ImageIcon(Main.class.getResource("../images/blockRedImage.png")).getImage();
	public final Image BLOCK_ORANGE = new ImageIcon(Main.class.getResource("../images/blockOrangeImage.png")).getImage();
	public final Image BLOCK_YELLOW = new ImageIcon(Main.class.getResource("../images/blockYellowImage.png")).getImage();
	public final Image BLOCK_GREEN = new ImageIcon(Main.class.getResource("../images/blockGreenImage.png")).getImage();
	public final Image BLOCK_CYAN = new ImageIcon(Main.class.getResource("../images/blockCyanImage.png")).getImage();
	public final Image BLOCK_BLUE = new ImageIcon(Main.class.getResource("../images/blockBlueImage.png")).getImage();
	public final Image BLOCK_PURPLE = new ImageIcon(Main.class.getResource("../images/blockPurpleImage.png")).getImage();
	
	public final Image LOCATION_RED = new ImageIcon(Main.class.getResource("../images/locationRedImage.png")).getImage();
	public final Image LOCATION_ORANGE = new ImageIcon(Main.class.getResource("../images/locationOrangeImage.png")).getImage();
	public final Image LOCATION_YELLOW = new ImageIcon(Main.class.getResource("../images/locationYellowImage.png")).getImage();
	public final Image LOCATION_GREEN = new ImageIcon(Main.class.getResource("../images/locationGreenImage.png")).getImage();
	public final Image LOCATION_CYAN = new ImageIcon(Main.class.getResource("../images/locationCyanImage.png")).getImage();
	public final Image LOCATION_BLUE = new ImageIcon(Main.class.getResource("../images/locationBlueImage.png")).getImage();
	public final Image LOCATION_PURPLE = new ImageIcon(Main.class.getResource("../images/locationPurpleImage.png")).getImage();
}
