package modelo;

import util.Util;
import entorno.Entorno;
import sonido.Sonido;

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
	public void disparar(){
		if(this.bala == null){
			Sonido.TanqueDisparo.play();
			this.bala = new Bala(this.entorno, tanque.x,tanque.y);
		}
		if(util.controlarLimiteDeTablero(this.bala.getX(), this.bala.getY(), this.tanque.getAnguloOrientacion())){
			movimiento2(this.entorno);
		}
	}
	
	//estoy manejando pixeles, hay que cambiar por casillas
	public void movimiento(Entorno ent){
		if(this.tanque.getAnguloOrientacion() == 0){//arriba
			this.bala.setY(this.bala.getY()-3);
			if(this.bala.getY() <= 0){
				this.bala = null;
			}
		}else if(this.tanque.getAnguloOrientacion() == 90){//derecha
			this.bala.setX(this.bala.getX()+3);
			if(this.bala.getX() >= 800){
				this.bala = null;
			}
		}else if(this.tanque.getAnguloOrientacion() == 180){//abajo
			this.bala.setY(this.bala.getY()+3);
			if(this.bala.getY() >= 600){
				this.bala = null;
			}
		}else if(this.tanque.getAnguloOrientacion() == 270){//izquierda
			this.bala.setX(this.bala.getX()-3);
			if(this.bala.getX() <= 0){
				this.bala = null;
			}
		}
		this.bala.dibujar();
	}

	public void movimiento2(Entorno ent){
		if(this.tanque.getAnguloOrientacion() == 0){//arriba
			this.bala.avanzarArriba();
			this.bala.dibujarArriba();
			if(this.bala.getY() <= 0){
				this.bala = null;
			}
		}else if(this.tanque.getAnguloOrientacion() == 90){//derecha
			this.bala.avanzarDerecha();
			this.bala.dibujarDerecha();
			if(this.bala.getX() >= 800){
				this.bala = null;
			}
		}else if(this.tanque.getAnguloOrientacion() == 180){//abajo
			this.bala.avanzarAbajo();
			this.bala.dibujarAbajo();
			if(this.bala.getY() >= 600){
				this.bala = null;
			}
		}else if(this.tanque.getAnguloOrientacion() == 270){//izquierda
			this.bala.avanzarIzquierda();
			this.bala.dibujarIzquierda();
			if(this.bala.getX() <= 0){
				this.bala = null;
			}
		}
		if(this.bala == null){
			Sonido.TanqueDisparo.stop();
			Sonido.TanqueDisparoExplocion.play();
		}
	}
}
