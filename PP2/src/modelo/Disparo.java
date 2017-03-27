package modelo;

import util.Util;

import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Disparo{
	private Util util;
	private double anguloOrientacion = 0; // 0º, 90º, 180º ó 270º
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
		if(util.controlarLimiteDeTablero(this.bala.getX(), this.bala.getY(), anguloOrientacion)){
			movimiento(ent);
		}
	}
	
	public void movimiento(Entorno ent){
		//mover circulo CONTROLANDO QUE NO CHOQUE CON EL FINAL
		//ent.dibujarCirculo(bala.getX()+1, bala.getY()+1, 5, Color.red);
		if(anguloOrientacion == 0){
			this.bala.setY(this.bala.getY()+3);
			System.out.println("Esto lo dispara 1 ");
		}else if(anguloOrientacion == 90){
			this.bala.setX(this.bala.getX()+3);
			System.out.println("Esto lo dispara 2 ");
		}else if(anguloOrientacion == 180){
			this.bala.setY(this.bala.getY()-3);
			System.out.println("Esto lo dispara 3 ");
		}else if(anguloOrientacion == 270){
			this.bala.setX(this.bala.getX()-3);
			System.out.println("Esto lo dispara 4 ");
		}
		this.bala.avanzarArriba();
		this.bala.dibujar(ent);;
	}

	private void dibujar(Entorno ent) {
		ent.dibujarCirculo(bala.getX(), bala.getY(), 5, Color.red);
	}
}
