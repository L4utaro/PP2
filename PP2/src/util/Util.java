package util;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Util {

	//controlarPosicion
	public boolean controlarLimiteDeTablero(double posicionX, double posicionY, double anguloOrientacion){ //,Posicion posicion
			if(anguloOrientacion  == 270 && posicionX == 0){
				return  false; //izquierda
			}if(anguloOrientacion  == 90 && posicionX == 24){
				return false; //derecha 
			}if(anguloOrientacion  == 0 && posicionY == 0){
				return false;//arriba 
			}if(anguloOrientacion  == 180 && posicionY == 24){
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
