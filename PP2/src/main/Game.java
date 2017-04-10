package main;

import java.util.ArrayList;
import java.util.List;

import entorno.*;
import estructura.Estructura;
import modelo.ObjetoGrafico;
import object.*;

public class Game extends InterfaceJuego {
   
    //private Tanque tanque;
	//private Image fondo = Herramientas.cargarImagen("imagen/fondo.jpg");
    //private Bala bala;
    private Draftsman dibujador;
    private GraphicMap mapa;
	private ListStructures estructuras;
    
	public Game() 
	{
		this.mapa = new GraphicMap(new Size(1000, 600), new Size(20, 20));
		this.dibujador = new Draftsman(this, mapa, "Battle-Ungs");
		this.estructuras = new ListStructures(40);
		//this.tanque = new Tanque(400, 400, 0);
	}
	
    public void tick() 
    {
    	this.dibujador.dibujarMarco(mapa);    	
    	for (ObjetoGrafico e:estructuras.getLista()) 
    	{
			this.dibujador.dibujarEstructura(e);	
		}
    }



}
