package modelo;

import java.awt.Color;

import entorno.Entorno;
import modelo.objeto.*;
import object.Coordinate;

public abstract class ObjetoGrafico {
	
	protected Coordinate coordenada;
	protected Tama�o tama�o;
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
	
	public Tama�o getTama�o()
	{
		return this.tama�o;
	}
	
	public void setTama�o(Tama�o t)
	{
		this.tama�o = t ;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}