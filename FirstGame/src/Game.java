import javax.swing.*;
import java.awt.*;
public class Game extends JPanel {
	private int width = 100;
	private int height = 100;
	private int d = 50; //diameter
	private int x = 0;
	private int y = 0;
	private int moveX = 1;
	private int moveY = 1;
	Color ballColor = new Color (0xE73AC0);
	
	private void moveBall(){
		if(x + moveX <= 0)
			moveX = 1;
			if(x + moveX > getWidth()- d)
				moveX = -1;
			if(y + moveY < 0)
				moveY = 1;
			if(y + moveY > getHeight() - d)
				moveY = -1;
		x += moveX;
		y += moveY;
		
	}
	
	
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(ballColor);
		g2d.fillOval(x, y, d, d);
		
				
		}

	

	public static void main(String[] args){
		JFrame frame = new JFrame();
		Game game = new Game();
		
		frame.setSize(700, 800); // x, y
		frame.setLocation(300,0);//x, y
		frame.setDefaultCloseOperation(3);
		frame.add(game);
		frame.setTitle("PingPong");
		frame.setResizable(false);//g�r s� man inte kan f�rstora en ruta
		frame.setVisible(true);// l�ter rutan visas lulz
		
		while(true){
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
