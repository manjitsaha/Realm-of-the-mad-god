package rtmg.entity;

import java.util.Random;

import rtmg.level.Level;

public class Entity {
	
	public int x , y;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();
	
}
