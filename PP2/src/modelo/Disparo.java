package modelo;

import util.Util;

import java.awt.Color;

import entorno.Entorno;

public class Disparo{
	private Util util;
	private Bala bala;
	private Tanque tanque;
	private Entorno entorno;

	public Disparo(Tanque tanque, Entorno entorno){
    	this.entorno = entorno;
		this.tanque = tanque;
		util = new Util();
	}

	//controlaLaOrientacionEnLa que se encuentra el tanque
	//esa orientacion se la pasa a ControlarLimiteDeTablero, que controla si se puede disparar en esa direccion
	//despues sale el disparo
	public void disparar(Entorno ent){
		if(this.bala == null){
			System.out.println("se creo la bala");
			this.bala = new Bala(tanque.x,tanque.y);
		}
		if(util.controlarLimiteDeTablero(this.bala.getX(), this.bala.getY(), this.tanque.getAnguloOrientacion())){
			movimiento(ent);
		}
	}
	
	//estoy manejando pixeles, hay que cambiar por casillas
	public void movimiento(Entorno ent){
		if(this.tanque.getAnguloOrientacion() == 0){
			this.bala.setY(this.bala.getY()-3);
			if(this.bala.getY() <= 0){
				this.bala = null;
			}
		}else if(this.tanque.getAnguloOrientacion() == 90){
			this.bala.setX(this.bala.getX()+3);
			if(this.bala.getX() >= 800){
				this.bala = null;
			}
		}else if(this.tanque.getAnguloOrientacion() == 180){
			this.bala.setY(this.bala.getY()+3);
			if(this.bala.getY() >= 600){
				this.bala = null;
			}
		}else if(this.tanque.getAnguloOrientacion() == 270){
			this.bala.setX(this.bala.getX()-3);
			if(this.bala.getX() <= 0){
				this.bala = null;
			}
		}
		this.bala.dibujar(ent);
	}

	private void dibujar(Entorno ent) {
		ent.dibujarCirculo(bala.getX(), bala.getY(), 5, Color.red);
	}
}
