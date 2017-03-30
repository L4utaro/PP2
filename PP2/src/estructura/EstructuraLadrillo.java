package estructura;

import java.awt.Color;

import entorno.Entorno;
import modelo.Bala;
import modelo.Casilla;
import modelo.ObjetoGrafico;

public class EstructuraLadrillo extends ObjetoGrafico implements Estructura{
	@SuppressWarnings("unused")
	private String imagenDir;
	


	@Override
	public void colisionBala(Bala bala, Casilla casilla) {
		//bala.destruir();
		this.destruir(casilla);
		
	}

	@Override
	public void destruir(Casilla casilla) {
		casilla.liberarCasilla();
	}

	@Override
	public void dibujar(Entorno unEntorno, Casilla casilla) {
		//unEntorno.dibujarRectangulo(casilla.x, Casilla.y, 20, 20, 0, Color.RED);
		
	}
}
