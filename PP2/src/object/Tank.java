package object;

import entorno.Entorno;
import enums.Orientation;
import enums.TankShot;
import modelo.ObjetoGrafico;
import modelo.objeto.Coordenada;
import util.Util;

public class Tank extends ObjetoGrafico {
	private Orientation orientation;
	private TankShot tankShot;
	private Coordinate coordinate;
	private Size size;
	private Bullet bullet;
	private double velocidadDeMovimiento = 5;
	
	public Tank(Orientation orientation, Coordinate coordinate,	Size size){
		this.orientation = orientation;
		this.coordinate = coordinate;
		this.size = size;
		this.tankShot = TankShot.NO_EXISTS;
	}

	//dependiendo del estado en que se encuentre se gira
	//le paso una nueva orientacion que reemplaza a la anterior, y cuando lo dibuje girara el tanque
	public void girar(Orientation orientation)
	{
		this.setOrientation(orientation);
	}
	
	//dependiendo del estado en que se encuentre se mueve
	public void moverseArriba()
	{
		if(getOrientation().equals(Orientation.UP))
			this.coordinate.setY(this.coordinate.getY()-this.velocidadDeMovimiento);
		//this.girar(Orientation.UP);			
	}
	public void moverseAbajo()
	{
		if(getOrientation().equals(Orientation.DOWN))
			this.coordinate.setY(this.coordinate.getY()+this.velocidadDeMovimiento);
		//this.girar(Orientation.DOWN);			
	}
	public void moverseDerecha()
	{
		if(getOrientation().equals(Orientation.RIGTH))
			this.coordinate.setX(this.coordinate.getX()+this.velocidadDeMovimiento);
		//this.girar(Orientation.RIGTH);			
	}
	public void moverseIzquierda()
	{
		if(getOrientation().equals(Orientation.LEFT))
			this.coordinate.setX(this.coordinate.getX()-this.velocidadDeMovimiento);
		//this.girar(Orientation.LEFT);			
	}
	
	public void disparar(){
		if(tankShot.equals(TankShot.NO_EXISTS)){
			bullet = new Bullet(orientation, 
					new Coordinate(this.coordinate.getX()+20,this.coordinate.getY()+20),
					new Size(10, 10));
			tankShot = TankShot.EXISTS;
		}
	}
	
	//dependiendo del estado en que se encuentre se mueve en esa posicion
	public void moverse(){
		//controlar que no choque con las estructuras o el limite del mapa
		if(!Util.estaEnElLimiteDeTablero(orientation, coordinate)){
			Util.moverse(orientation, coordinate, velocidadDeMovimiento);
		}
	}
	
	public double getAngulo() {
		if(this.orientation.equals(Orientation.UP)){
			return 0;
		}if(this.orientation.equals(Orientation.DOWN)){
			return Math.PI;
		}if(this.orientation.equals(Orientation.LEFT)){
			return Math.PI*1.5;
		}if(this.orientation.equals(Orientation.RIGTH)){
			return Math.PI/2;
		}
	return 0;
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

	@Override
	public void dibujar(Entorno ent, Coordenada c) {
		// TODO Auto-generated method stub
		
	}
}
