package modelo;

import util.Util;

import java.awt.Color;

import entorno.Entorno;

public class Disparo {
	private Util util;
	private double anguloOrientacion = 0; // 0º, 90º, 180º ó 270º
	private Bala bala;
	
	public Disparo(){
		util = new Util();
	}

	//controlaLaOrientacionEnLa que se encuentra el tanque
	//esa orientacion se la pasa a ControlarLimiteDeTablero, que controla si se puede disparar en esa direccion
	//despues sale el disparo
	public void disparar(Entorno ent){
		if(util.controlarLimiteDeTablero(anguloOrientacion)){
			bala = new Bala();
			//ent.dibujarCirculo(TanqueX+1, tanqueY+1, 5, Color.red);
			movimiento(ent);
		}
	}
	
	public void movimiento(Entorno ent){
		if(anguloOrientacion == 0){
			
		}
	}
}
