package object;

import enums.Orientation;
import enums.TankShot;

public class Tank {
	private Orientation orientation;
	private TankShot tankShot;
	private Coordinate coordinate;
	private Size size;
	private Bullet bullet;
	
	public Tank(Orientation orientation, Coordinate coordinate,	Size size){
		this.orientation = orientation;
		this.coordinate = coordinate;
		this.size = size;
	}

	//dependiendo del estado en que se encuentre se gira
	//le paso una nueva orientacion que reemplaza a la anterior, y cuando lo dibuje girara el tanque
	public void girar(Orientation orientation){
		
	}
	
	//dependiendo del estado en que se encuentre se mueve
	public void moverse(){
		
	}
	
	public void disparar(){
		if(tankShot.equals(TankShot.NO_EXISTS)){
			bullet = new Bullet(orientation, coordinate,
					new Size(10, 10));
			tankShot = TankShot.EXISTS;
		}
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	public TankShot getTankBullet() {
		return tankShot;
	}

	public void setTankBullet(TankShot tankShot) {
		this.tankShot = tankShot;
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
