package rtmg.level;

import rtmg.level.tile.Tile;
import rtmg.screen.Screen;

public class Level {
	
	protected int width , height;
	protected int[] tiles;

	
	
	public Level(int width , int height) {
		this.width = width;
		this.height = height;
		tiles = new int[width * height];
		generateLevel();				
	}
	
	public Level(String path) {
		LoadLevel(path);
	}

	private void LoadLevel(String path) {
		
		
	}

	protected void generateLevel() {
		
		
	}
	
	public void update() {
		
	}
	
	private void time() {
		
	}
	
	public void render(int xScroll , int yScroll , Screen screen) {
		screen.setOffset(xScroll, yScroll);
		int x0 = xScroll >> 4;
		int x1 = (xScroll + screen.width) >> 4; 
		int y0 = yScroll >> 4;
		int y1 = (yScroll + screen.width) >> 4; 
	}
	
	public Tile getTile(int x , int y) {
		if(tiles[x+y*width] == 0) return Tile.grass;
		
		return Tile.voidTile;
		
	}

}
