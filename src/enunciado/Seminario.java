package enunciado;

public class Seminario extends DisciplinaAnual {

	// atributos
	protected boolean frequentou;
	
	// construtores
	public Seminario() {
		
	}
	
	public Seminario(double[] testes, double comportamento, double trabalho) {
		super(testes, comportamento, trabalho);
	}
	
	public Seminario(double[] testes, double comportamento, double trabalho, boolean frequentou) {
		super(testes, comportamento, trabalho);
		this.frequentou = frequentou;
	}
	// acessores
	public void setFrequentou(boolean frequentou) {
		this.frequentou = frequentou;
	}
	
	public boolean getFrequentou() {
		return frequentou;
	}
	
	// metodos
	@Override
	public boolean isAprovado() {
		if (notaFinal() >= 9.5 && frequentou == true)
			return true;
		else			
			return false;
	}
	
	// toString
	@Override
	public String toString() {
		String r = "";
		r += "-------Avaliação Seminário-------\n";
		r += "Nota Final: " + notaFinal() + "\n";
		r += "Índice: " + indice() + "\n";
		r += (isAprovado() == true) ? "Aluno aprovado.\n" : "Aluno reprovado.\n";
		r += "\n";
		return r;
	}
}
