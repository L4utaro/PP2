package presentacion.controlador;

import modelo.*;

@SuppressWarnings("unused")
public class CrearEscenario {
	private Mapa mapa;
	private Tablero tablero;
	
	public CrearEscenario(){
		tablero = new Tablero(520, 520);
		inicializar();
	}

	private void inicializar() {
		Bloque [] [] bloques = CrearMatrizDeBloques();
		this.mapa = new Mapa(bloques);
	}

	private Bloque[][] CrearMatrizDeBloques() {
		for (int i = 0; i < 26;i++){ //X=40
			
		}
		return null;
	}
}
