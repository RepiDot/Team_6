package tetris;

import java.awt.Image;

import javax.swing.ImageIcon;

public interface Images {
	public final Image tetrisBackground = new ImageIcon(Main.class.getResource("../images/tetrisBackgroundImage.png")).getImage();;
	
	public Image boardDarkImage = new ImageIcon(Main.class.getResource("../images/boardDarkImage.png")).getImage();
	public Image boardLightImage = new ImageIcon(Main.class.getResource("../images/boardLightImage.png")).getImage();
	
	public Image blockRedImage = new ImageIcon(Main.class.getResource("../images/blockRedImage.png")).getImage();
	public Image blockOrangeImage = new ImageIcon(Main.class.getResource("../images/blockOrangeImage.png")).getImage();
	public Image blockYellowImage = new ImageIcon(Main.class.getResource("../images/blockYellowImage.png")).getImage();
	public Image blockGreenImage = new ImageIcon(Main.class.getResource("../images/blockGreenImage.png")).getImage();
	public Image blockCyanImage = new ImageIcon(Main.class.getResource("../images/blockCyanImage.png")).getImage();
	public Image blockBlueImage = new ImageIcon(Main.class.getResource("../images/blockBlueImage.png")).getImage();
	public Image blockPurpleImage = new ImageIcon(Main.class.getResource("../images/blockPurpleImage.png")).getImage();
}
