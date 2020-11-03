package rtmg.level.tile.spawn_level;

import rtmg.level.tile.Tile;
import rtmg.screen.Screen;
import rtmg.screen.Sprite;

public class SpawnWallTile extends Tile {

	public SpawnWallTile(Sprite sprite) {
		super(sprite);
		// TODO Auto-generated constructor stub
	}
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}
	
	@Override
	public boolean solid() {
		return true;
	}

}
