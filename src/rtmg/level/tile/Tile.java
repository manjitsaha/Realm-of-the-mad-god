package rtmg.level.tile;

import rtmg.screen.Screen;
import rtmg.screen.Sprite;

public class Tile {
	
	public int x , y;
	public Sprite sprite;
	
	public static Tile grass = new GrassTile(Sprite.grass);
	public static Tile flower = new FlowerTile(Sprite.flower);
	public static Tile stone = new StoneTile(Sprite.stone);
	
	public static Tile voidTile = new VoidTile(Sprite.voidSprite);
	
	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}
	
	public void render(int x , int y, Screen screen) {
		
	}
	
	public boolean solid() {return false;}

}
