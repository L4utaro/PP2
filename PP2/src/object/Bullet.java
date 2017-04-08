package object;

import enums.Orientation;

public class Bullet {
	private Orientation orientation;
	private Coordinate coordinate;
	private Size size;
	
	public Bullet(Orientation orientation, Coordinate coordinate, Size size){
		this.orientation = orientation;
		this.coordinate = coordinate;
		this.size = size;
	}

	public void avanzarBullet(){
		
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
