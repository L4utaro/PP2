package util;

import java.awt.Image;

import javax.swing.ImageIcon;

import object.Coordinate;

public class Util {

	//controla la posicion del objeto a traves de las coordenadas, para asegurarse que no salga del limite del mapa
		public static boolean controlarLimiteDeTablero(Coordinate coordinate){ //,Posicion posicion
			if( coordinate.getX() == 20){
				System.out.println("FUERA DE RANGO IZQUIERDA");
				return  false; //izquierda
			}if(coordinate.getX() == 780){
				System.out.println("FUERA DE RANGO DERECHA");
				return false; //derecha 
			}if(coordinate.getY() == 0){
				System.out.println("FUERA DE RANGO ARRIBA");
				return false;//arriba 
			}if(coordinate.getY() == 580){
				System.out.println("FUERA DE RANGO ABAJO");
				return false; //abajo 
			}
			return true;
		}
		
	public static ImageIcon redimension(ImageIcon icono, int x,int y){
		Image img = icono.getImage(); 
		Image otraimg = img.getScaledInstance(x,y,java.awt.Image.SCALE_SMOOTH); //creamos una imagen nueva dándole las dimensiones que queramos a la antigua
		ImageIcon otroicon = new ImageIcon(otraimg);
		return otroicon;
	}
	
}


/*if(anguloOrientacion  == 270 && posicionX == 0){
return  false; //izquierda
}if(anguloOrientacion  == 90 && posicionX == 24){
return false; //derecha 
}if(anguloOrientacion  == 0 && posicionY == 0){
return false;//arriba 
}if(anguloOrientacion  == 180 && posicionY == 24){
return false; //abajo 
}
return true;*/
