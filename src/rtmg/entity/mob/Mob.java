package rtmg.entity.mob;

import rtmg.entity.Entity;
import rtmg.screen.Sprite;

public class Mob extends Entity {
	
	protected Sprite sprite;
	protected int dir = 0;
	protected boolean moving = false;
	
	public void move(int xa , int ya) {
		if(ya < 0) dir =  0;
		if(xa > 0) dir = 1;
		if(ya > 0) dir = 2;
		if(xa < 0) dir = 3;
		
		if(!collison()) {
			x += xa;
			y += ya;
		}
		
	}
	
	public void update() {
		
	}
	
	public boolean collison() {
		return false;
	}
	

}
