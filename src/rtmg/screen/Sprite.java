package rtmg.screen;

public class Sprite {
	
	public final int SIZE;
	private int x , y;
	public int[] pixels;
	private SpriteSheet sheet;
	
	public static Sprite grass = new Sprite(16,0,5,SpriteSheet.tiles);
	public static Sprite flower = new Sprite(16,1,0,SpriteSheet.tiles);
	public static Sprite stone = new Sprite(16,2,0,SpriteSheet.tiles);
	public static Sprite voidSprite = new Sprite(16,0x1b87e0);
	
	// spawn level
	public static Sprite spawn_grass = new Sprite(16,0,0,SpriteSheet.spawnLevel);
	public static Sprite spawn_hedge = new Sprite(16,1,0,SpriteSheet.spawnLevel);
	public static Sprite spawn_water = new Sprite(16,2,0,SpriteSheet.spawnLevel);
	public static Sprite spawn_wall1 = new Sprite(16,0,1,SpriteSheet.spawnLevel);
	public static Sprite spawn_wall2 = new Sprite(16,0,2,SpriteSheet.spawnLevel);
	public static Sprite spawn_floor = new Sprite(16,1,1,SpriteSheet.spawnLevel);
	
	// player sprites
	public static Sprite playerUp = new Sprite(32,0,5,SpriteSheet.tiles);
	public static Sprite playerUp1 = new Sprite(32,0,6,SpriteSheet.tiles);
	public static Sprite playerUp2 = new Sprite(32,0,7,SpriteSheet.tiles);
	
	public static Sprite playerDown = new Sprite(32,2,5,SpriteSheet.tiles);
	public static Sprite playerDown1 = new Sprite(32,2,6,SpriteSheet.tiles);
	public static Sprite playerDown2 = new Sprite(32,2,7,SpriteSheet.tiles);
	
	public static Sprite playerSide = new Sprite(32,1,5,SpriteSheet.tiles);
	public static Sprite playerSide1 = new Sprite(32,1,6,SpriteSheet.tiles);
	public static Sprite playerSide2 = new Sprite(32,1,7,SpriteSheet.tiles);
	
	
	
	public Sprite(int size , int x, int y, SpriteSheet sheet) {
		SIZE = size;
		pixels = new int[size * size];
		this.x = x * size;
		this.y = y * size;
		this.sheet = sheet;
		load();
		
	}
	
	public Sprite(int size , int colour) {
		SIZE = size;
		pixels = new int[size * size];
		setColour(colour);
		
	}
	
	private void setColour(int colour) {
		for(int i = 0 ; i < SIZE * SIZE; i++) {
			pixels[i] = colour;
		}
		
	}

	private void load() {
		for(int y = 0; y < SIZE ; y++) {
			for(int x = 0 ; x < SIZE ; x++) {
				pixels[x+y*SIZE] = sheet.pixels[(x + this.x) + (y + this.y)*sheet.SIZE];
			}
		}
	}

}
