package object;

import java.awt.Color;
import entorno.*;

public class Draftsman {
	private Entorno entorno;

	public Draftsman(InterfaceJuego i, GraphicMap gm, String title)
	{
		this.dibujarEscenario(i,gm,title);
	}
	
	public void dibujarEscenario(InterfaceJuego i, GraphicMap gm, String title)
	{
		this.entorno = new Entorno(i, title, (int)gm.getSizeMap().getAncho(), (int)gm.getSizeMap().getAlto());
	}
	
	public void dibujarMarco(GraphicMap gm)
	{
		//System.out.println(gm.getSizeMap().getAncho()+" "+gm.getSizeMap().getAlto());
		this.entorno.dibujarRectangulo(0, 0, gm.getSizeMarco().getAncho(), gm.getSizeMap().getAlto()*2, 0, Color.GRAY);
		this.entorno.dibujarRectangulo(0, 0, gm.getSizeMap().getAncho()*2, gm.getSizeMarco().getAlto(), 0, Color.RED);
		this.entorno.dibujarRectangulo(gm.getSizeMap().getAncho()+10, 0, gm.getSizeMarco().getAncho(), gm.getSizeMap().getAlto()*2+20, 0, Color.GREEN);
		this.entorno.dibujarRectangulo(0, gm.getSizeMap().getAlto()+10, gm.getSizeMap().getAncho()*2, gm.getSizeMarco().getAlto(), 0, Color.BLUE);
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
