package object;

import java.awt.Color;

import entorno.Entorno;
import entorno.Herramientas;

public class Draftsman {
	private Entorno entorno;
	
	public Draftsman(Entorno entorno){
		this.entorno = entorno;
	}
	
	public void dibujarImagen(String rutaImagen, Coordinate coordinate){
		this.entorno.dibujarImagen(Herramientas.cargarImagen(rutaImagen), coordinate.getX(), coordinate.getY(), 0);
	}
	
	public void dibujarImagen(String rutaImagen, Coordinate coordinate, double angulo){
		this.entorno.dibujarImagen(Herramientas.cargarImagen(rutaImagen), coordinate.getX(), coordinate.getY(), angulo);
	}
	
	public void dibujarRectangulo(Coordinate coordinate, Size size, double angulo, Color color){
		this.entorno.dibujarRectangulo(coordinate.getX(), coordinate.getY(), size.getAncho(), 
				size.getAlto(), angulo, color);
	}
	
	public void dibujarCirculo(Coordinate coordinate, double diametro, Color color){
		this.entorno.dibujarCirculo(coordinate.getX(), coordinate.getY(), diametro, color);
	}
}
