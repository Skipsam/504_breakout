import java.awt.Color;
import java.awt.Graphics;

public class Brick extends Sprite {
	
	private boolean broken = false;
	
	public Brick(int x, int y) {
		//sets initial values from input variables and predefined values set in settings, uses methods from the parent "Sprites"
		setX(x);
		setY(y);
		setWidth(Settings.BRICK_WIDTH);
		setHeight(Settings.BRICK_HEIGHT);
	}

	public boolean isBroken() {
		//getter for the broken variable
		return broken;
		}
	
	public void setBroken(boolean b) {
		//setter for the broken variable
		broken = b;
	}
	
	public void paint(Graphics g) {
		//paints brick if not broken
		if(!broken) {
			g.setColor(Color.BLACK);
			g.fillRect(x, y, Settings.BRICK_WIDTH, Settings.BRICK_HEIGHT);
			}
		}
	}
