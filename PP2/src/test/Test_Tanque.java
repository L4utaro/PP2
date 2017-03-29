package test;

import java.awt.Image;

import entorno.Entorno;
import entorno.Herramientas;
import entorno.InterfaceJuego;

import modelo.Tanque;

public class Test_Tanque extends InterfaceJuego{
    private Entorno entorno;
    private Tanque tanque;

    private int ANCHO_ENTORNO = 800;
    private int ALTO_ENTORNO = 600;
    
    private Image fondo;
    
    public Test_Tanque(){
    	this.entorno = new Entorno(this, "Battle-City", ANCHO_ENTORNO, ALTO_ENTORNO);
    	this.tanque = new Tanque(400, 300, 0);
    	
    	this.fondo=Herramientas.cargarImagen("imagen/fondoTablero.jpg");
    }
    
    public void tick(){

    	this.entorno.dibujarImagen(this.fondo, entorno.getWidth()/2,entorno.getHeight()/2, 0, 0.5);
		
		this.tanque.Dibujar(this.entorno, true);
		
		this.tanque.controlAvance(this.entorno);

    }

	@SuppressWarnings("unused")
    public static void main(String[] args) {
    	Test_Tanque test = new Test_Tanque();
    }
}
