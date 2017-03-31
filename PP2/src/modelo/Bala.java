package modelo;

//import java.awt.Image;
import entorno.Entorno;
import entorno.Herramientas;

public class Bala {
	private Entorno entorno;
	private double x;
	private double y;
    private double velocidad = 3;
    //private Image imagen = Herramientas.cargarImagen("imagen/bala 00.png");
	
	public Bala (Entorno entorno, double x2, double y2){
		this.entorno = entorno;
		this.x = x2;
		this.y = y2;
	}

	 public void avanzarArriba() {
		 if (this.y > 0)
			 this.y -= this.velocidad;
	     this.entorno.dibujarImagen(Herramientas.cargarImagen("imagen/bala00Arriba.png"), this.x, this.y, 0);
	 }
	 
	 public void avanzarAbajo() {
		 if (this.y > 0)
			 this.y += this.velocidad;
	     this.entorno.dibujarImagen(Herramientas.cargarImagen("imagen/bala00Abajo.png"), this.x, this.y, 0);
	 }
	
	 public void avanzarDerecha() {
		 if (this.x > 0)
			 this.x += this.velocidad;
	     this.entorno.dibujarImagen(Herramientas.cargarImagen("imagen/bala00Derechapng"), this.x, this.y, 0);
	 }
	
	 public void avanzarIzquierda() {
		 if (this.x > 0)
			 this.x -= this.velocidad;
	     this.entorno.dibujarImagen(Herramientas.cargarImagen("imagen/bala00Izquierda.png"), this.x, this.y, 0);
	 }
	
	 public void dibujar() {
	     //   this.entorno.dibujarCirculo(this.x, this.y + 30, 5, Color.green);
	        this.entorno.dibujarImagen(Herramientas.cargarImagen("imagen/bala00Derecha.png"), this.x, this.y, 0);
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
