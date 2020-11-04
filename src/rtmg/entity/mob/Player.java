package rtmg.entity.mob;

import rtmg.Game;
import rtmg.input.Keyboard;
import rtmg.input.Mouse;
import rtmg.screen.Screen;
import rtmg.screen.Sprite;

public class Player extends Mob {
	private Keyboard input;
	private Sprite sprite;
	private int anim = 0;
	private boolean walking = false;

	public Player(Keyboard input) {
		this.input = input;

	}

	public Player(int x, int y, Keyboard input) {
		this.x = x;
		this.y = y;
		this.input = input;

	}

	public void update() {
		int xa = 0, ya = 0;
		if (anim < 7500)
			anim++;
		else
			anim = 0;

		if (!input.run) {
			if (input.up)
				ya--;
			if (input.down)
				ya++;
			if (input.left)
				xa--;
			if (input.right)
				xa++;
		}

		// run
		if (input.run) {
			if (input.right)
				xa += 2;
			if (input.down)
				ya += 2;

			if (input.left)
				xa -= 2;

			if (input.up)
				ya -= 2;
		}

		

		if (xa != 0 || ya != 0) {
			move(xa, ya);
			walking = true;
		} else {
			walking = false;
		}
		
		shooting();

	}

	
	private void shooting() {
		if (Mouse.getMouseB() == 1) {
			double dx = Mouse.getMouseX() - Game.getWindowWidth()/2;
			double dy = Mouse.getMouseY() - Game.getWindowHeight()/2;
			double dir = Math.atan2(dy, dx);
			shoot(x, y, dir);
		}		
	}

	public void render(Screen screen) {
		int flip = 0;
		if (dir == 0) {
			sprite = Sprite.playerUp;
			if (walking) {
				if (anim % 20 > 10) {
					sprite = Sprite.playerUp1;
				} else {
					sprite = Sprite.playerUp2;
				}
			}
		}
		if (dir == 1) {
			sprite = Sprite.playerSide;
			if (walking) {
				if (anim % 20 > 10) {
					sprite = Sprite.playerSide1;
				} else {
					sprite = Sprite.playerSide2;
				}
			}
		}
		if (dir == 2) {
			sprite = Sprite.playerDown;
			if (walking) {
				if (anim % 20 > 10) {
					sprite = Sprite.playerDown1;
				} else {
					sprite = Sprite.playerDown2;
				}
			}
		}
		if (dir == 3) {
			sprite = Sprite.playerSide;
			flip = 1;
			if (walking) {
				if (anim % 20 > 10) {
					sprite = Sprite.playerSide1;
				} else {
					sprite = Sprite.playerSide2;
				}
			}
		}

		screen.renderPlayer(x - 16, y - 16, sprite, flip);

	}

}
