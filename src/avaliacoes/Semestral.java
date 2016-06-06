package avaliacoes;

public class Semestral extends Avaliacao {
	

	// ATRIBUTOS
	
	protected Testes testes = new Testes();
	protected Nota comportamento;

	// GETS E SETS
	
	public Testes getTestes() {
		return testes;
	}
	
	public Nota getTeste(int index) {
		return testes.getTeste(index);
	}

	public void setTestes(Testes testes) {
		this.testes = testes;
	}
	
	public void setTeste(Nota nota, int index) {
		this.testes.setTeste(index, nota);
	}
	

	
	public Nota getComportamento() {
		return comportamento;
	}

	public void setComportamento(Nota comportamento) {
		this.comportamento = comportamento;
	}

	// Métodos
	
	@Override 
	public char indice(){
		return testes.indice();
	}
	
	@Override
	public boolean aprovado() {
		return notaFinal().positiva() ;
	}

	@Override
	public Nota notaFinal() {
		double aux = 0.8 * getTestes().media() + 0.2 * comportamento.getNota();
		Nota nota = new Nota(aux);
		return nota;
	}

}
