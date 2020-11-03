package rtmg.screen;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {
	private String path;
	public final int SIZE;
	public int[] pixels;
	
	public static SpriteSheet tiles = new SpriteSheet("res/textures/sheets/spritesheet.png",256);
	public static SpriteSheet spawnLevel = new SpriteSheet("res/textures/sheets/spawn_level.png",48);
	
	public SpriteSheet(String path , int size) {
		this.path = path;
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		loadImg();
	}
	
	private void loadImg() {
		try {
			BufferedImage bf = ImageIO.read(new File(path));
			int w = bf.getWidth();
			int h = bf.getHeight();
			
			bf.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
