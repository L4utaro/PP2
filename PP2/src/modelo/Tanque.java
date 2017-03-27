package modelo;

import java.awt.Color;
import java.awt.Image;

import entorno.Entorno;
import entorno.Herramientas;

public class Tanque {
	
	double x;
	double y;
	double anguloOrientacion= 0; // 0º, 90º, 180º ó 270º
	Image imagen_tanque;
	
	double avanceDeCasillero=20;//debería avanzar 20 pixeles (1 casillero)
	private Bala bala;
	
	//Construcor
	public Tanque(double unX, double unY, double unAnguloOrientacion){
		this.x= unX;
		this.y= unY;
		this.anguloOrientacion= unAnguloOrientacion;
		
		this.imagen_tanque= Herramientas.cargarImagen("img/tanque7.png");
	}
	
	
	/****** cambiarOrientacion-inicio ******/
	
	//Si se presiona la tecla 'derecha' una sola vez y si el Tanque NO estaba 
	//orientado hacia la 'izquierda'
	public void girar_Derecha(){
		this.anguloOrientacion =0;
		modificarFrenteTanque();
	}
	
	//Si se presiona la tecla 'izquierda' una sola vez y si el Tanque NO estaba 
	//orientado hacia la 'izquierda'
	public void girar_Izquierda(){
		this.anguloOrientacion = 180;
		modificarFrenteTanque();
	}
	
	public void girar_Arriba(){
		this.anguloOrientacion = 90;
		modificarFrenteTanque();
	}
	
	public void girar_Abajo(){
		this.anguloOrientacion = 270;
		modificarFrenteTanque();
	}
	
	//Da la vuelta el tanque
	public void girar_180(){
		this.anguloOrientacion +=180;
		modificarFrenteTanque();
	}
	
	//Gira el tanque con el nuevo "anguloOrientación"
	public void modificarFrenteTanque(){
		this.x += Math.cos(anguloOrientacion);
		this.y += Math.sin(anguloOrientacion);
	}
	
	/******* cambiarOrientacion-fin *******/
	
	
	
	/****** movimientos-inicio ******/
	
	public void avanzarDerecha(){
		this.x += avanceDeCasillero;
	}
	
	public void avanzarIzquierda(){
		this.x -= avanceDeCasillero;
	}
	
	public void avanzarArriba(){
		this.y += avanceDeCasillero;
	}
	
	public void avanzarAbajo(){
		this.y -= avanceDeCasillero;
	}
	
	public void controlAvance(Entorno ent){
		//DERECHA
		if(ent.estaPresionada(ent.TECLA_DERECHA) && anguloOrientacion==0){
			avanzarDerecha();
		}
		if(ent.estaPresionada(ent.TECLA_DERECHA) && anguloOrientacion!=0){
			girar_Derecha();
		}
		
		//ARRIBA
		if(ent.estaPresionada(ent.TECLA_ARRIBA) && anguloOrientacion==90){
			avanzarArriba();
		}
		if(ent.estaPresionada(ent.TECLA_ARRIBA) && anguloOrientacion!=90){
			girar_Arriba();
		}
		
		//IZQUIERDA
		if(ent.estaPresionada(ent.TECLA_IZQUIERDA) && anguloOrientacion==180){
			avanzarIzquierda();
		}
		if(ent.estaPresionada(ent.TECLA_IZQUIERDA) && anguloOrientacion!=180){
			girar_Izquierda();
		}
		
		//ABAJO
		if(ent.estaPresionada(ent.TECLA_ABAJO) && anguloOrientacion==270){
			avanzarArriba();
		}
		if(ent.estaPresionada(ent.TECLA_ABAJO) && anguloOrientacion!=270){
			girar_Arriba();
		}
	}
	
	/****** movimientos-fin ******/
	
	
	//disparo la bala segun el "anguloOrientacion" actual
	public void disparo(){
		/*if(this.anguloOrientacion == 0){
			this.bala.avanzarDerecha();
		}
		
		if(this.anguloOrientacion == 90){
			this.bala.avanzarArriba();
		}
		
		if(this.anguloOrientacion == 180){
			this.bala.avanzarIzquierda();
		}
		
		if(this.anguloOrientacion == 0){
			this.bala.avanzarAbajo();
		}*/
		
	}
	
	
	
	//AutoDestruccion
	public void autoDestruccion(){
		
	}
	
	
	
	public void Dibujar(Entorno ent,boolean bala){
		ent.dibujarImagen(this.imagen_tanque,this.x+5, this.y,this.anguloOrientacion,0.8);			//cañon
		if(bala==true){						
		ent.dibujarCirculo(x+9, y-23,21, Color.GREEN);}				//municion que tiene cargada
		//else{ent.dibujarCirculo(x+9, y-23,21, Color.RED); }
		
	}
	
}
