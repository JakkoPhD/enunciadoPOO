package enunciado;

public class DisciplinaAnual extends DisciplinaSemestral {

	// atributos
	protected double trabalho;

	// comstrutores
	public DisciplinaAnual() {

	}

	public DisciplinaAnual(double[] testes, double comportamento, double trabalho) {
		super(testes, comportamento);
		if (trabalho >= 0 && trabalho <= 20)
			this.trabalho = trabalho;
		else
			notaDeTrabalhoInvalida(trabalho);
	}

	// acessores
	public void setTrabalho(double trabalho) {
		if (trabalho >= 0 && trabalho <= 20)
			this.trabalho = trabalho;
		else
			notaDeTrabalhoInvalida(trabalho);
	}

	public double getTrabalho() {
		return trabalho;
	}

	// metodos
	@Override
	public double notaFinal() {
		return super.notaFinal() * 0.7 + trabalho * 0.3;
	}

	// mensagens de validação incorreta
	protected void notaDeTrabalhoInvalida(double nota) {
		System.out.println("A nota do trabalho tem valor de " + nota
				+ " que é um valor inválido.\nNão vai, por isso, ser registado.");
	}
	
	// toString
	@Override
	public String toString() {
		String r = "";
		r += "-------Disciplina Anual-------\n";
		r += "Nota Final: " + notaFinal() + "\n";
		r += "Índice: " + indice() + "\n";
		r += (isAprovado() == true) ? "Aluno aprovado.\n" : "Aluno reprovado.\n";
		r += "\n";
		return r;
	}
}
