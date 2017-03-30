package estructura;

import java.awt.Color;

import modelo.Bala;
import modelo.Casilla;
import modelo.ObjetoGrafico;
import entorno.Entorno;

public class EstructuraAgua extends ObjetoGrafico implements Estructura {
	@SuppressWarnings("unused")
	private String imagenDir;

	public void colisionBala(){
		
	}

	@Override
	public void colisionBala(Bala bala, Casilla casilla) 
	{
		// no hace nada
		
	}

	@Override
	public void destruir(Casilla casilla) 
	{
		
		
	}

	@Override
	public void dibujar(Entorno unEntorno, Casilla casilla) {
		//unEntorno.dibujarRectangulo(casilla.x, casilla.y, 20, 20, 0, Color.BLUE);
		
	}
}
