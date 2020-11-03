package rtmg.level.tile.spawn_level;

import rtmg.level.tile.Tile;
import rtmg.screen.Screen;
import rtmg.screen.Sprite;

public class SpawnGrassTile extends Tile {

	public SpawnGrassTile(Sprite sprite) {
		super(sprite);
		// TODO Auto-generated constructor stub
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}

}
