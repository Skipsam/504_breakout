import java.awt.Graphics;

public class Paddle extends Sprite {

	private int xVelocity;
	
	public Paddle() {
		//fetches dimensions of paddle from settings and calls methods from the parent class "Sprite"
		setWidth(Settings.PADDLE_WIDTH);
		setHeight(Settings.PADDLE_HEIGHT);
		resetPosition();
	}
	
	public void resetPosition() {
		//fetches initial position of paddle from settings and calls methods from the parent class "Sprite"
		x = Settings.INITIAL_PADDLE_X;
		y = Settings.INITIAL_PADDLE_Y;
		
	}
	
	public void update() {
		x += xVelocity;
		//prevents paddle position from exceeding the window in either direction
		if (x >= (Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH)){
			x = (Settings.WINDOW_WIDTH- Settings.PADDLE_WIDTH);
		}
		
		if (x <= 0) {
			x=0;
		}
	}
	
	public void paint(Graphics g) {
		g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
	}
	
	public void setXVelocity(int vel) {
		xVelocity = vel;
	}
}
