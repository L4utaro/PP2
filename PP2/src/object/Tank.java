package object;

import enums.Orientation;
import enums.TankBullet;

public class Tank {
	private Orientation orientation;
	private TankBullet tankBullet;
	private Coordinate coordinate;
	private Size size;
	private Bullet bullet;
	
	public Tank(Orientation orientation, Coordinate coordinate,	Size size){
		this.orientation = orientation;
		//this.tankBullet = NO_EXISTS; 
		this.coordinate = coordinate;
		this.size = size;
	}

	public void moverse(){
		
	}
	
	public void disparar(){
		if(tankBullet.equals(TankBullet.NO_EXISTS)){
			bullet = new Bullet(orientation, coordinate,
					new Size(10, 10));
		}
	}
	
	public void girar(Orientation orientation){
		
	}
	
	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	public TankBullet getTankBullet() {
		return tankBullet;
	}

	public void setTankBullet(TankBullet tankBullet) {
		this.tankBullet = tankBullet;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Bullet getBullet() {
		return bullet;
	}

	public void setBullet(Bullet bullet) {
		this.bullet = bullet;
	}
}
