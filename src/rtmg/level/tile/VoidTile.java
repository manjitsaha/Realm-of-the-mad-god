package rtmg.level.tile;

import rtmg.screen.Screen;
import rtmg.screen.Sprite;

public class VoidTile extends Tile {

	public VoidTile(Sprite sprite) {
		super(sprite);
		
	}
	
	public void render(int x , int y , Screen screen) {
		screen.renderTile(x, y, this);
	}
	

}
