package modelo;

import java.awt.Color;

import entorno.Entorno;
import modelo.objeto.*;
import object.Coordinate;

public abstract class ObjetoGrafico {
	
	protected Coordinate coordenada;
	protected Tamaño tamaño;
	protected Imagen imagen;
	protected Color color;
	
	public ObjetoGrafico()
	{

	}
	//public abstract void dibujar(Entorno ent);

	public abstract void dibujar(Entorno ent, Coordenada c);
	
	public Coordinate getCoordenada() 
	{
		return coordenada;
	}

	public void setCoordenada(Coordinate coordenada) 
	{
		this.coordenada = coordenada;
	}

	public Imagen getImagen() 
	{
		return imagen;
	}

	public void setImagen(Imagen imagen) 
	{
		this.imagen = imagen;
	}	
	
	public Tamaño getTamaño()
	{
		return this.tamaño;
	}
	
	public void setTamaño(Tamaño t)
	{
		this.tamaño = t ;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}