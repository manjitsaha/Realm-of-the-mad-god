package rtmg.entity;

import java.util.Random;

import rtmg.level.Level;
import rtmg.screen.Screen;

public abstract class Entity {

	public int x, y;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();
	
	
	public void update() {
		
	}
	
	public void render(Screen screen) {
		
	}

	public void remove() {
		removed = true;
	}

	public boolean isRemoved() {
		return removed;
	}

}
