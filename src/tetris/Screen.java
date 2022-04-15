package tetris;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Screen extends KeyEvent {
	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		// 스크린 사이즈
	private Image screenImage = getScreenImage();									// 스크린 이미지
	private Graphics screenGraphic = getScreenGraphic();							// 스크린 그래픽
	
	public void openScreen() {
		System.out.println(screenSize.width);
		System.out.println(screenSize.height);
		setSize(screenSize.width, screenSize.height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated(true);
		addKeyListener(this);
		setLayout(new FlowLayout());
		setVisible(true);
		
		background = new ImageIcon(Main.class.getResource(main)).getImage();
	}
	
	public void paint(Graphics g) {
		screenImage = createImage(screenSize.width, screenSize.height);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(background, 0, 0, null);
		g.drawImage(boardImage, 710, 70, null);
		g.drawImage(blockImage_1, x, y, null);
		
		this.repaint();
	}
}
