package util;

import java.util.List;

import modelo.ObjetoGrafico;
import object.Tank;

public class Colision {
	
	
	public Colision()
	{
		
	}
	
	public static boolean colisionUp(Tank tank, ObjetoGrafico objGraf)
	{
		
		if(tank.getCoordinate().getY() == objGraf.getCoordenada().getY()+objGraf.getTamaño().getAlto())
		{
			if(tank.getCoordinate().getX() < objGraf.getCoordenada().getX()+objGraf.getTamaño().getAncho() &&
					tank.getCoordinate().getX()+tank.getSize().getAncho() > objGraf.getCoordenada().getX())
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean anyColisionUp(Tank tank, List<ObjetoGrafico> list)
	{
		for(int i= 0; i < list.size(); i++){
			if(Colision.colisionUp(tank, list.get(i)))
				return true;
		}
		return false;
	}
	
	
	public static boolean colisionDown(Tank tank, ObjetoGrafico objGraf)
	{
		if(tank.getCoordinate().getY()+tank.getSize().getAlto() == objGraf.getCoordenada().getY())
		{
			if(tank.getCoordinate().getX() < objGraf.getCoordenada().getX()+objGraf.getTamaño().getAncho() &&
					tank.getCoordinate().getX()+tank.getSize().getAncho() > objGraf.getCoordenada().getX())
			{
				return true;
			}
		}
		return false;
	}
	public static boolean anyColisionDown(Tank tank, List<ObjetoGrafico> list)
	{
		for(int i= 0; i < list.size(); i++){
			if(Colision.colisionDown(tank, list.get(i)))
				return true;
		}
		return false;
	}
	
	
	
	public static boolean colisionRigth(Tank tank, ObjetoGrafico objGraf)
	{
		if(tank.getCoordinate().getX()+tank.getSize().getAncho() == objGraf.getCoordenada().getX())
		{
			if(tank.getCoordinate().getY() < objGraf.getCoordenada().getY()+objGraf.getTamaño().getAlto() &&
					tank.getCoordinate().getY()+tank.getSize().getAlto() > objGraf.getCoordenada().getY())
				return true;
		}
		return false;
	}
	
	public static boolean anyColisionRigth(Tank tank, List<ObjetoGrafico> list)
	{
		for(int i= 0; i < list.size(); i++){
			if(Colision.colisionRigth(tank, list.get(i)))
				return true;
		}
		return false;
	}
	public static boolean colisionLeft(Tank tank, ObjetoGrafico objGraf)
	{
		if(tank.getCoordinate().getX() == objGraf.getCoordenada().getX()+objGraf.getTamaño().getAncho())
		{
			if(tank.getCoordinate().getY() < objGraf.getCoordenada().getY()+objGraf.getTamaño().getAlto() &&
			tank.getCoordinate().getY()+tank.getSize().getAlto() > objGraf.getCoordenada().getY())
				return true;
		}
		return false;
	}
	public static boolean anyColisionLeft(Tank tank, List<ObjetoGrafico> list)
	{
		for(int i= 0; i < list.size(); i++){
			if(Colision.colisionLeft(tank, list.get(i)))
				return true;
		}
		return false;
	}
	
}
