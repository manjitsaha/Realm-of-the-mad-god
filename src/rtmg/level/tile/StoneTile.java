package rtmg.level.tile;

import rtmg.screen.Screen;
import rtmg.screen.Sprite;

public class StoneTile extends Tile {

	public StoneTile(Sprite sprite) {
		super(sprite);
		// TODO Auto-generated constructor stub
	}
	
	public void render(int x , int y , Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}
	
	public boolean solid() {return true;}

}
