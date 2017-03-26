package modelo;

import util.Util;

import java.awt.Color;

import entorno.Entorno;

public class Disparo {
	private Util util;
	private double anguloOrientacion = 0; // 0º, 90º, 180º ó 270º
	private Bala bala;
	private Tanque tanque;
	
	public Disparo(Tanque tanque){
		this.tanque = tanque;
		util = new Util();
	}

	//controlaLaOrientacionEnLa que se encuentra el tanque
	//esa orientacion se la pasa a ControlarLimiteDeTablero, que controla si se puede disparar en esa direccion
	//despues sale el disparo
	public void disparar(Entorno ent){
		if(util.controlarLimiteDeTablero(anguloOrientacion)){
			bala = new Bala(tanque.x,tanque.y);
			movimiento(ent);
		}
	}
	
	public void movimiento(Entorno ent){
		//mover circulo CONTROLANDO QUE NO CHOQUE CON EL FINAL
		ent.dibujarCirculo(bala.getX()+1, bala.getY()+1, 5, Color.red);
		if(anguloOrientacion == 0){
			this.bala.setY(this.bala.getY()+1);
		}else if(anguloOrientacion == 90){
			this.bala.setX(this.bala.getX()+1);
		}else if(anguloOrientacion == 180){
			this.bala.setY(this.bala.getY()-1);
		}else if(anguloOrientacion == 270){
			this.bala.setX(this.bala.getX()-1);
		}
		ent.dibujarCirculo(tanque.x+1, tanque.y+1, 5, Color.red);
	}
}
