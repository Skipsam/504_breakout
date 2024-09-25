import java.awt.Graphics;

public class Ball extends Sprite {

	private int xVelocity = 1, yVelocity = -1;
	
	// Constructor
	public Ball() {
		//fetches dimensions of ball from settings and calls methods from the parent class "Sprite"
		setWidth(Settings.BALL_WIDTH);
		setHeight(Settings.BALL_HEIGHT);
		resetPosition();
	}
	

	public void resetPosition() {
		//fetches initial position of ball from settings and calls methods from the parent class "Sprite"
		setX(Settings.INITIAL_BALL_X);
		setY(Settings.INITIAL_BALL_Y);
	}
	
	public void update() {
		x += xVelocity;
		y += yVelocity;

		if(x <= 0) {
			//detects if the ball is at or has left the screen, resets to in the screen and changes velocity to appear to bounce off wall
			setX(0);
			setXVelocity(1);

		}
		

		if(x >= Settings.WINDOW_WIDTH - Settings.BALL_WIDTH) {
			//detects if the ball is at or has left the screen, resets to in the screen and changes velocity to appear to bounce off wall
			 setX(Settings.WINDOW_WIDTH -Settings.BALL_WIDTH);
			 setXVelocity(-1);

		}
		
		if(y <= 0) {
			//detects if the ball is at or has left the screen, resets to in the screen and changes velocity to appear to bounce off wall
			setY(0);
			setYVelocity(1);
		}
		
	}
	//standard getters and setters to allow variables to be accessed or modified from outside the class
	public void setXVelocity(int x) {
		xVelocity = x;
	}
	public void setYVelocity(int y) {
		yVelocity = y;
	}
	
	public int getXVelocity() {
		return xVelocity;
	}
	public int getYVelocity() {
		return yVelocity;	
	}
	
	public void paint(Graphics g) {
		g.fillOval(x, y, Settings.BALL_WIDTH, Settings.BALL_HEIGHT);
	}
}
