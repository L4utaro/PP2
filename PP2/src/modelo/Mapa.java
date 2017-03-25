package modelo;

public class Mapa {
	private Bloque [] [] bloques; 
	
	public Mapa(Bloque [] [] bloques){
		this.bloques = bloques;
	}

	public Bloque[][] getBloques() {
		return bloques;
	}

	public void setBloques(Bloque[][] bloques) {
		this.bloques = bloques;
	}
}
