package util;

import java.awt.Image;

import javax.swing.ImageIcon;

import enums.Orientation;
import object.Coordinate;

public class Util {

	//controla la posicion del objeto a traves de las coordenadas, para asegurarse que no salga del limite del mapa
		public static boolean estaEnElLimiteDeTablero(Orientation orientation, Coordinate coordinate){ //,Posicion posicion
			if( orientation.equals(Orientation.LEFT) && coordinate.getX() <= 20){
				return  true; //izquierda
			}if(orientation.equals(Orientation.RIGTH) && coordinate.getX() >= 780){
				return true; //derecha 
			}if(orientation.equals(Orientation.UP) && coordinate.getY() <= 20){
				return true;//arriba 
			}if(orientation.equals(Orientation.DOWN) && coordinate.getY() >= 580){
				return true; //abajo 
			}
			return false;
		}
		
	public static void moverse(Orientation orientation, Coordinate coordinate, double velocidadDeMovimiento){
		if(orientation.equals(Orientation.UP)){
			coordinate.setY(coordinate.getY() - velocidadDeMovimiento);
		}
		if(orientation.equals(Orientation.DOWN)){
			coordinate.setY(coordinate.getY() + velocidadDeMovimiento);
		}
		if(orientation.equals(Orientation.LEFT)){
			coordinate.setX(coordinate.getX() - velocidadDeMovimiento);
		}
		if(orientation.equals(Orientation.RIGTH)){
			coordinate.setX(coordinate.getX() + velocidadDeMovimiento);
		}
	}
		
		
	public static ImageIcon redimension(ImageIcon icono, int x,int y){
		Image img = icono.getImage(); 
		Image otraimg = img.getScaledInstance(x,y,java.awt.Image.SCALE_SMOOTH); //creamos una imagen nueva dándole las dimensiones que queramos a la antigua
		ImageIcon otroicon = new ImageIcon(otraimg);
		return otroicon;
	}
	
}
