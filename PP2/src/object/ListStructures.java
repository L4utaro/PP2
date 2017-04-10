package object;

import java.util.*;

import estructura.EstructuraAcero;
import estructura.EstructuraAgua;
import estructura.EstructuraLadrillo;
import modelo.ObjetoGrafico;
import modelo.objeto.Tamaño;

public class ListStructures 
{
	private int lenght;
	private List<ObjetoGrafico> estructuras;
	private boolean listaLenghtValidate;
	
	public ListStructures(int length)
	{
		this.setLenght(length);
		this.estructuras = new ArrayList<>();
		this.inicializarLista();
	}

	private void inicializarLista() 
	{
		if(listaLenghtValidate)
		{
			for(int i=0;i<lenght;i++)
			{
				this.estructuras.add((ObjetoGrafico)new EstructuraAcero());
				this.estructuras.add((ObjetoGrafico)new EstructuraAgua());
				this.estructuras.add((ObjetoGrafico)new EstructuraLadrillo());
			}
		}
		for(ObjetoGrafico o : estructuras)
		{
			Random ale = new Random();
			int x = 40+(ale.nextInt(24)*40);
			int y = 40+(ale.nextInt(14)*40);
			o.setCoordenada(new Coordinate(x, y));
			o.setTamaño(new Tamaño(40,40));
		}
	}

	public int getLenght() 
	{
		return lenght;
	}

	public void setLenght(int lenght) 
	{
		this.lenght = lenght;
		this.listaLenghtValidate = lenght>0 && lenght<50;
	}

	public List<ObjetoGrafico> getLista() {
		return estructuras;
	}
		
}
