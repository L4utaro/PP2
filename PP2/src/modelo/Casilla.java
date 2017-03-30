package modelo;

public class Casilla {

	private boolean estaVacia;
	private ObjetoGrafico objetoGrafico;
	private int x , y;
	
	//ObjetoGrafico
	public Casilla()
	{
		this.estaVacia = false;		
	}
	

	public boolean isEstaVacia() 
	{
		return estaVacia;
	}

	public void setEstaVacia(boolean estaVacia) 
	{
		this.estaVacia = estaVacia;
	}


	public void liberarCasilla() 
	{
		this.setEstaVacia(true);
		this.objetoGrafico = null;
		
	}
}
