package main;

import java.awt.Color;
import java.awt.Image;

import entorno.Entorno;
import entorno.Herramientas;
import entorno.InterfaceJuego;
import modelo.Tanque;

public class Juego extends InterfaceJuego {
    private Entorno entorno;
    private Tanque tanque;
    private int ANCHO_ENTORNO = 800;
    private int ALTO_ENTORNO = 600;
	private Image fondo = Herramientas.cargarImagen("imagen/fondo.jpg");
	
	public Juego() {
    	this.entorno = new Entorno(this, "Battle-City", ANCHO_ENTORNO, ALTO_ENTORNO);
		this.tanque = new Tanque(400, 500, 0);
	}
	

    public void tick() {
    	if (!esElFin()) {
        	this.entorno.dibujarRectangulo(300,300, 520, 520, 0, Color.gray);
        	//this.entorno.dibujarRectangulo(300,300, 500, 500, 0, Color.black);
        	this.entorno.dibujarImagen(fondo, 300, 300, 0);
        	
    		manejo_tanque();
    		
    		//manejo_disparo();
    		
    	}
    	else{
            String mensaje;
            mensaje = "Termino el Juego";
            this.entorno.cambiarFont("Arial", 28, Color.yellow);
            this.entorno.escribirTexto(mensaje, 300, 290);
    	}
    }


	private void manejo_tanque() {
		
		if(this.entorno.estaPresionada(this.entorno.TECLA_DERECHA) && this.tanque.getAnguloOrientacion() == 0){
			this.tanque.avanzarDerecha();
		}
		if(this.entorno.estaPresionada(this.entorno.TECLA_DERECHA) && this.tanque.getAnguloOrientacion()!=0){
			this.tanque.girar_Derecha();
		}
		//ARRIBA
		if(this.entorno.estaPresionada(this.entorno.TECLA_ARRIBA) && this.tanque.getAnguloOrientacion()==Math.PI*1.5){
			this.tanque.avanzarArriba();
		}
		if(this.entorno.estaPresionada(this.entorno.TECLA_ARRIBA) && this.tanque.getAnguloOrientacion()!=Math.PI*1.5){
			this.tanque.girar_Arriba();
		}
		//IZQUIERDA
		if(this.entorno.estaPresionada(this.entorno.TECLA_IZQUIERDA) && this.tanque.getAnguloOrientacion()==Math.PI){
			this.tanque.avanzarIzquierda();
		}
		if(this.entorno.estaPresionada(this.entorno.TECLA_IZQUIERDA) && this.tanque.getAnguloOrientacion()!=Math.PI){
			this.tanque.girar_Izquierda();
		}
		//ABAJO
		if(this.entorno.estaPresionada(this.entorno.TECLA_ABAJO) && this.tanque.getAnguloOrientacion()==Math.PI/2){
			this.tanque.avanzarAbajo();
		}
		if(this.entorno.estaPresionada(this.entorno.TECLA_ABAJO) && this.tanque.getAnguloOrientacion()!=Math.PI/2){
			this.tanque.girar_Abajo();
		}
		
    	this.tanque.dibujar(this.entorno);
		
	}

    private void manejo_disparo() {
		// TODO Auto-generated method stub
		
	}

	//cuando termina eñ juego
	private boolean esElFin() {
		return false;
	}
}
