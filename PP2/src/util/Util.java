package util;

public class Util {

	//controlarPosicion
	public boolean controlarLimiteDeTablero(double anguloOrientacion){ //,Posicion posicion
			int posicionX = 0;
			int posicionY = 24;
			if(anguloOrientacion  == 270 && posicionX == 0){
				return  false; //izquierda
			}if(anguloOrientacion  == 90 && posicionX == 24){
				return false; //derecha 
			}if(anguloOrientacion  == 0 && posicionY == 0){
				return false;//arriba 
			}if(anguloOrientacion  == 180 && posicionY == 24){
				return false; //abajo 
			}
		return false;
	}
}
