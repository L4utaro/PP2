package modelo;

import java.awt.Color;

import entorno.Entorno;

public class Bala {
	private double x;
	private double y;
    private double velocidad = 5;
	
	public Bala (double x2, double y2){
		this.x = x2;
		this.y = y2;
	}

	 public void avanzarArriba() {
	        if (this.y > 0)
	            this.y -= this.velocidad;
	    }
	
	 public void dibujar(Entorno ent) {
	        ent.dibujarCirculo(this.x, this.y + 30, 5, Color.red);
	    }
	 
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
}
