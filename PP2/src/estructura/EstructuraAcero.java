package estructura;

import java.awt.Color;

import entorno.Entorno;
import modelo.Bala;
import modelo.Casilla;
import modelo.ObjetoGrafico;

public class EstructuraAcero extends ObjetoGrafico implements Estructura{
	@SuppressWarnings("unused")
	private String imagenDir;

	public void colisionBala(){
		
	}

	@Override
	public void colisionBala(Bala bala, Casilla casilla) 
	{
		//bala.destruir();
		
	}

	@Override
	public void destruir(Casilla casilla) 
	{
		casilla.liberarCasilla();
		
	}

	@Override
	public void dibujar(Entorno unEntorno, Casilla casilla) {
		//unEntorno.dibujarRectangulo(casilla.x, casilla.y, 20, 20, 0, Color.GRAY);
		
	}
}
