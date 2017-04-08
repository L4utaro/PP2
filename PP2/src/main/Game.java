package main;

import entorno.*;
import object.*;

public class Game extends InterfaceJuego {
   
    //private Tanque tanque;
	//private Image fondo = Herramientas.cargarImagen("imagen/fondo.jpg");
    //private Bala bala;
    private Draftsman dibujador;
    private GraphicMap mapa;
	
	public Game() 
	{
		this.mapa = new GraphicMap(new Size(1000, 600), new Size(20, 20));
		this.dibujador = new Draftsman(this, mapa, "Battle-Ungs");
		//this.tanque = new Tanque(400, 400, 0);
	}
	
    public void tick() 
    {
    	this.dibujador.dibujarMarco(mapa);	
    	
    }



}
