package rtmg.entity.projectile;

public class WizardProjectile extends Projectile {

	public WizardProjectile(int x, int y, double dir) {
		super(x, y, dir);
		range = 200;
		damage = 20;
		rateOfFire = 15;
		speed = 4;
		
		nx = speed * Math.cos(angle);
		ny = speed * Math.asin(angle);
	}
	
	public void update() {
		move();
	}
	
	protected void move() {
		x += nx;
		y += ny;
	}
	
	

}
