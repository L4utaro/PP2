package test;

import entorno.Entorno;
import entorno.InterfaceJuego;
import modelo.Disparo;
import modelo.Tanque;

public class Test extends InterfaceJuego{
    private Entorno entorno;
    private Tanque tanque;
    private Disparo disparo;
    private int ANCHO_ENTORNO = 800;
    private int ALTO_ENTORNO = 600;
    
    Test(){
    	//this.entorno = new Entorno(this, "Battle-City", ANCHO_ENTORNO, ALTO_ENTORNO);
    	this.tanque = new Tanque(5, 5, 0);
//    	this.tanque.Dibujar(entorno, false);
    	this.disparo = new Disparo(tanque);
    	this.disparo.disparar(entorno);
    	
    }
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
    	Test test = new Test ();
    }
}
