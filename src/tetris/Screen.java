package tetris;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Screen extends JFrame implements KeyListener, Images {
	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		
	private Image screenImage;
	private Graphics screenGraphic;				
	private Board board = new Board();
	private Block block = new Block();
	
	public Image background;
	
	public void openScreen() {
		setSize(screenSize.width, screenSize.height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated(true);
		addKeyListener(this);
		setLayout(new FlowLayout());
		setVisible(true);
		
		background = tetrisBackground;
	}
	
	public void paint(Graphics g) {
		screenImage = createImage(screenSize.width, screenSize.height);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(background, 0, 0, null);
		board.drawBoard(g, "basic");
		block.drawBlock(g);
		this.repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		block.blockKeyPressed(e);
		if(e.getKeyCode() == 27) {				// ESC : exit
			System.exit(0);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
