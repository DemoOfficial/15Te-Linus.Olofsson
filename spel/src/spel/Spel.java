import javax.swing.*;
import java.awt.*;

public class Spel extends JPanel {
	Ball ball = new Ball(this);

	private void move() {
		ball.moveBall();
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		ball.paint(g2d);
	}

	public void gameOver() {
		JOptionPane.showMessageDialog(this, "Game Over", "Game over", JOptionPane.YES_NO_OPTION);
		System.exit(ABORT);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Spel game = new Game();

		frame.setSize(700, 800); // x, y
		frame.setLocation(300, 0);// x, y
		frame.setDefaultCloseOperation(3);
		frame.add(game);
		frame.setTitle("PingPong");
		frame.setResizable(false);// g�r s� man inte kan f�rstora en ruta
		frame.setVisible(true);// l�ter rutan visas lulz

		while (true) {
			game.moveBall();
			game.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
