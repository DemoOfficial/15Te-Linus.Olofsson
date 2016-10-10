import java.awt.*;

public class Ball {
	private int d = 50; // diameter
	private int x = 0;
	private int y = 0;
	private int moveX = 1;
	private int moveY = 1;
	Color ballColor = new Color(0xE73AC0);
	private Game game;

public ball(Game game){
	this.game = game;
}

	void moveBall() {
		if (x + moveX <= 0)
			moveX = 1;
		if (x + moveX > getWidth() - d)
			moveX = -1;
		if (y + moveY < 0)
			moveY = 1;
		if (y + moveY > getHeight() - d)
			moveY = -1;
		x += moveX;
		y += moveY;
	}



	public void paint(Graphics2D g) {
		g.g2d.setColor(ballColor);
		g.g2d.fillOval(x, y, d, d);

	}
}
