package test;

import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;
import enums.Orientation;
import enums.TankShot;
import object.Bullet;
import object.Coordinate;
import object.Size;
import object.Tank;

public class Test extends InterfaceJuego{
    private Entorno ent;
    private Tank tank;
    private Bullet bullet;
	private TankShot tankShot;
    
	//EN ESTE TEST ESTA EL TANQUE Y BALA
    public Test(){
		this.ent = new Entorno(this, "GameDemo", 800, 600);
    	this.tank = new Tank(Orientation.UP, new Coordinate(400, 300),new Size(40, 40));
		this.tankShot = TankShot.NO_EXISTS;
    }
    
	public void control_tank(){
		if(ent.estaPresionada(ent.TECLA_DERECHA)){
			if(this.tank.getOrientation().equals(Orientation.RIGTH)){
				tank.moverse();
			}
			this.tank.setOrientation(Orientation.RIGTH);
		}
		if(ent.estaPresionada(ent.TECLA_ARRIBA)){
			if(this.tank.getOrientation().equals(Orientation.UP)){
				tank.moverse();
			}
			this.tank.setOrientation(Orientation.UP);
		}
		if(ent.estaPresionada(ent.TECLA_IZQUIERDA)){
			if(this.tank.getOrientation().equals(Orientation.LEFT)){
				tank.moverse();
			}
			this.tank.setOrientation(Orientation.LEFT);
		}
		if(ent.estaPresionada(ent.TECLA_ABAJO)){
			if(this.tank.getOrientation().equals(Orientation.DOWN)){
				tank.moverse();
			}
			this.tank.setOrientation(Orientation.DOWN);
		}
		if(ent.estaPresionada(ent.TECLA_ENTER)){
			if(this.tankShot.equals(TankShot.NO_EXISTS)){
				bullet = new Bullet(this.tank.getOrientation(), new Coordinate(tank.getCoordinate().getX(),tank.getCoordinate().getY()),
						new Size(10, 10));
				this.tankShot = TankShot.EXISTS;
			}
		}
		this.ent.dibujarRectangulo(
				this.tank.getCoordinate().getX(),
				this.tank.getCoordinate().getY(), this.tank.getSize().getAncho(),
				this.tank.getSize().getAlto(), this.tank.getAngulo(), Color.red);
	}
    
	public void control_bullet(){
		if(this.tankShot.equals(TankShot.EXISTS)){
			this.bullet.avanzarBullet();
			this.ent.dibujarCirculo(this.bullet.getCoordinate().getX(), 
					this.bullet.getCoordinate().getY(), 10, Color.green);
			if(this.bullet.colisionBullet()){
				this.tankShot = TankShot.NO_EXISTS;
				this.bullet = null;
			}
		}
	}
	
    public void tick(){
    	control_tank();
    	control_bullet();
    }

	@SuppressWarnings("unused")
    public static void main(String[] args) {
    	Test test = new Test ();
    }
}
