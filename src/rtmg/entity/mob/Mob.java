package rtmg.entity.mob;

import rtmg.entity.Entity;
import rtmg.screen.Sprite;

public class Mob extends Entity {
	
	protected Sprite sprite;
	protected int dir = 0;
	protected boolean moving = false;
	
	public void move(int xa , int ya) {
		
		if(xa != 0 && ya != 0) {
			move(0,ya);
			move(xa,0);
			
			return;
		}
		
		if(ya < 0) dir =  0;
		if(xa > 0) dir = 1;
		if(ya > 0) dir = 2;
		if(xa < 0) dir = 3;
		
		if(!collison(xa , ya)) {
			x += xa;
			y += ya;
		}
		
		
	}
	
	public void update() {
		
	}
	
	public boolean collison(int xa , int ya) {
		boolean solid = false;
		for(int c = 0 ; c < 4 ; c++) {
			int xt = ((x + xa) + c % 2 * 14 - 7) >> 4;
			int yt = ((y + ya) + c / 2 * 12 + 3) >> 4;
			if((level.getTile(xt, yt)).solid()) solid =  true;
		}
		
		return solid;
	}
	

}
