package modelo;

import util.Util;
public class Bala {
	private Util util;
	//movimiento
	
	public Bala(){
		util = new Util();
	}
	
	public void disparar(){
		//controlaLaOrientacionEnLa que se encuentra
		//esa orientacion se la pasa a ControlarLimiteDeTablero, que controla si se puede disparar en esa direccion
		//despues sale el disparo
		controlarOrientacion();
		util.controlarLimiteDeTablero();
	}
	
	public String controlarOrientacion(){
		return null;
	}
	
	public void movimiento(){
		
	}
}
