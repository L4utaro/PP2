package modelo;

public class Casilla {

	private boolean estaVacia;
	//ObjetoGrafico
	public Casilla()
	{
		this.estaVacia = false;
		
	}
	

	public boolean isEstaVacia() {
		return estaVacia;
	}

	public void setEstaVacia(boolean estaVacia) {
		this.estaVacia = estaVacia;
	}
}
