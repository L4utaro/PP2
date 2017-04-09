package object;

import enums.Orientation;
import util.Util;

public class Bullet {
	private Orientation orientation;
	private Coordinate coordinate;
	private Size size;
	
	public Bullet(Orientation orientation, Coordinate coordinate, Size size){
		this.orientation = orientation;
		this.coordinate = coordinate;
		this.size = size;
	}
	
	
	// no se si entraria aca esto?
	//seria si colisiona con una estructura o con el limite del tablero
	public void colisionBullet(){
		if(!Util.controlarLimiteDeTablero(coordinate)){
			//TankBullet = TankBullet.NO_EXISTS;
			//bullet = null; o bulletDesaparece();
		}
	}
	
	public void avanzarBullet(){
		colisionBullet();
		if(this.orientation.equals(Orientation.UP)){
			this.coordinate.setY(this.coordinate.getY() - 5);
		}
		if(this.orientation.equals(Orientation.DOWN)){
			this.coordinate.setY(this.coordinate.getY() + 5);
		}
		if(this.orientation.equals(Orientation.LEFT)){
			this.coordinate.setX(this.coordinate.getX() - 5);
		}
		if(this.orientation.equals(Orientation.RIGTH)){
			this.coordinate.setX(this.coordinate.getX() + 5);
		}
	}
	
	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
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
}
