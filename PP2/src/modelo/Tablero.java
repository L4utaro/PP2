package modelo;

import modelo.*;

public class Tablero {
	private int sizeX;
	private int sizeY;
	private Casilla [][] casillas;
	
	public Tablero(int sizeX, int sizeY){
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		int casillasPorMapa = 26;
		inicializar(casillasPorMapa);
	}
	
	private void inicializar(int casillasPorMapa) {
		for(int fila = 0; fila < casillasPorMapa; fila++){
			for(int colum = 0; colum < casillasPorMapa; colum++){
				casillas [fila] [colum] = new Casilla (); 
			}
		}
	}

	public int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}

	public Casilla[][] getCasillas() {
		return casillas;
	}

	public void setCasillas(Casilla[][] casillas) {
		this.casillas = casillas;
	}
}
