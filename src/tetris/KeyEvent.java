package tetris;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeyEvent extends JFrame implements KeyListener {
	public int x = 860;				// 블록이 처음 나오는 위치의 x좌표
	public int y = 70;				// 블록이 처음 나오는 위치의 y좌표
	private Image screenImage;
	private Graphics screenGraphic;
	public Image background;	
	String main = "../images/mainBackgroundImage.jpg";
	String select = "../images/selectBackgroundImage.jpg";
	public Image blockImage_1 = new ImageIcon(Main.class.getResource("../images/Block_1.png")).getImage();
	public Image boardImage = new ImageIcon(Main.class.getResource("../images/TetrisBoardImage.png")).getImage();
	
	@Override
	public void keyTyped(java.awt.event.KeyEvent e) {		// 키를 입력할 때
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {		// 키를 눌렀을 때
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
		if(e.getKeyCode() == 27) {				// ESC : 종료
			System.exit(0);
		} else if(e.getKeyCode() == 32) {		// Space : 창 변경(테스트)
			background = new ImageIcon(Main.class.getResource(select)).getImage();
			JPanel panel = new JPanel();
			JButton button = new JButton("버튼");
			panel.add(button);
			add(panel);
		} else if(e.getKeyCode() == 40) {		// 아래쪽 화살표 : 블록을 밑으로 이동
			if(y != 1020) {						// 보드 밖으로 나가는 것을 방지
				y += 50;
			}
			System.out.println("y좌표 : " + y);
		} else if(e.getKeyCode() == 38) {		// 위쪽 화살표 : 블록을 위로 이동(추후 블록 회전으로 변경 예정)
			y -= 50;
			System.out.println("y좌표 : " + y);
		} else if(e.getKeyCode() == 39) {		// 오른쪽 화살표 : 블록을 오른쪽으로 이동
			if(x != 1010) {						// 보드 밖으로 나가는 것을 방지
				x += 50;
			}
			System.out.println("x좌표 : " + x);
		} else if(e.getKeyCode() == 37) {		// 왼쪽 화살표 : 블록을 왼쪽으로 이동
			if(x != 710) {						// 보드 밖으로 나가는 것을 방지
				x -= 50;
			}
			System.out.println("x좌표 : " + x);
		}
	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent e) {	// 키를 놨을 때
		// TODO Auto-generated method stub
		
	}

	public Image getScreenImage() {
		return screenImage;
	}

	public void setScreenImage(Image screenImage) {
		this.screenImage = screenImage;
	}

	public Graphics getScreenGraphic() {
		return screenGraphic;
	}

	public void setScreenGraphic(Graphics screenGraphic) {
		this.screenGraphic = screenGraphic;
	}
	
}
