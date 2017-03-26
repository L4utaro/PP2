package util;

public class Util {

	//controlarPosicion
	public boolean controlarLimiteDeTablero(){
			int posicionX = 0;
			int posicionY = 24;
			if(posicionX  == 0){
				return  false; //izquierda
			}if(posicionX == 24){
				boolean derecha = false;
			}if(posicionY == 0){
				boolean arriba = false;
			}if(posicionY == 24){
				boolean abajo = false;
			}
		return false;
	}
}
