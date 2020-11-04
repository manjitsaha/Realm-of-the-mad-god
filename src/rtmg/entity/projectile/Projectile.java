package rtmg.entity.projectile;

import rtmg.entity.Entity;
import rtmg.screen.Sprite;

public abstract class Projectile extends Entity {
	
	protected final int xOrigin , yOrigin;
	protected double angle;
	protected Sprite sprite;
	protected double nx , ny;
	protected double speed , rateOfFire , range , damage;
	
	public Projectile(int x, int y , double dir) {
		xOrigin = x;
		yOrigin = y;
		angle = dir;
	}
	
	protected void move() {
		
	}

}
