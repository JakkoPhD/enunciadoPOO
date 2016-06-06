package avaliacoes;

public class Nota {

	// ATRIBUTOS

	protected double nota;
	
	// construtores
	
	public Nota(){
		this.nota = 0;
	}
	
	public Nota(double nota){
		if (notaValida(nota))
			this.nota = nota;
		else
			this.nota = 0;
	}

	
	// Gets e Sets

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	// Métodos
	
	private boolean notaValida(double nota){
		return nota >= 0 && nota <= 20;
	}
	
	public boolean positiva(){
		return nota >= 9.5;
	}
}
