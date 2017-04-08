package object;

import modelo.ObjetoGrafico;

public class GraphicMap extends Map{
	
	private Size sizeMarco;
	
	public GraphicMap(Size map, Size marco)
	{
		super(map);
		this.sizeMarco = marco;
	}

	public Size getSizeMarco() 
	{
		return sizeMarco;
	}

	public void setSizeMarco(Size sizeMarco) 
	{
		this.sizeMarco = sizeMarco;
	}
	
	public ObjetoGrafico getObjetoEnCoordenada(Coordinate coor)
	{
		return null;
	}
}
