package enunciado;

public class DisciplinaSemestral extends Disciplina {

	// construtores
	public DisciplinaSemestral() {

	}

	public DisciplinaSemestral(double[] testes, double comportamento) {
		for (int i = 0; i < testes.length; i++) {
			if (testes[i] >= 0 && testes[i] <= 20)
				this.testes.add(testes[i]);
			else {
				notaDeTesteInvalida(i, testes[i]);
			}
		}
		if (comportamento >= 0 && comportamento <= 20)
			this.comportamento = comportamento;
		else
			notaDeComportamentoInvalida(comportamento);
	}

	// acessores
	public void setTestes(double[] testes) {
		for (int i = 0; i < testes.length; i++) {
			if (testes[i] >= 0 && testes[i] <= 20)
				this.testes.set(i, testes[i]);
			else {
				notaDeTesteInvalida(i, testes[i]);
			}
		}
	}

	public double[] getTestes() {
		double[] testes = new double[this.testes.size()];
		for (int i = 0; i < testes.length; i++)
			testes[i] = this.testes.get(i);
		return testes;
	}

	public void setTeste(int index, double nota) {
		if (nota >= 0 && nota <= 20)
			testes.set(index, nota);
		else {
			notaDeTesteInvalida(index, nota);
		}
	}

	public double getTeste(int index) {
		return testes.get(index);
	}

	public void setComportamento(double comportamento) {
		if (comportamento >= 0 && comportamento <= 20)
			this.comportamento = comportamento;
		else
			notaDeComportamentoInvalida(comportamento);
	}

	public double getComportamento() {
		return comportamento;
	}

	// metodos
	@Override
	public double notaFinal() {
		double somaTestes = 0;
		for (int i = 0; i < testes.size(); i++)
			somaTestes += getTeste(i);
		double mediaTestes = somaTestes / testes.size();
		double nota = mediaTestes * 0.8 + comportamento * 0.2;
		return nota;
	}

	@Override
	public char indice() {
		double mediaParaIndice = (notaMaisBaixa() + notaMaisAlta()) / 2;
		char indice;
		if (mediaParaIndice <= 4)
			indice = 'E';
		else if (mediaParaIndice <= 9)
			indice = 'D';
		else if (mediaParaIndice <= 13)
			indice = 'C';
		else if (mediaParaIndice <= 17)
			indice = 'B';
		else
			indice = 'A';
		return indice;
	}

	@Override
	public boolean isAprovado() {
		if (notaFinal() >= 9.5)
			return true;
		else
			return false;
	}

	protected double notaMaisBaixa() {
		double notaMaisBaixa = 21;
		for (int i = 0; i < testes.size(); i++) {
			if (notaMaisBaixa > getTeste(i))
				notaMaisBaixa = getTeste(i);
		}
		return notaMaisBaixa;

	}

	protected double notaMaisAlta() {
		double notaMaisAlta = -1;
		for (int i = 0; i < testes.size(); i++) {
			if (notaMaisAlta < getTeste(i))
				notaMaisAlta = getTeste(i);
		}
		return notaMaisAlta;
	}

	// mensagens de validação incorreta
	protected void notaDeTesteInvalida(int index, double nota) {
		System.out.println("O teste nº " + (index + 1) + " tem uma nota de " + nota
				+ " que é um valor inválido.\nNão vai, por isso, ser registado.");
	}

	protected void notaDeComportamentoInvalida(double nota) {
		System.out.println("A nota de comportamento tem o valor de " + nota
				+ " que é um valor inválido.\nNão vai, por isso, ser registado.");
	}

	// toString
	@Override
	public String toString() {
		String r = "";
		r += "-------Disciplina Semestral-------\n";
		r += "Nota Final: " + notaFinal() + "\n";
		r += "Índice: " + indice() + "\n";
		r += (isAprovado() == true) ? "Aluno aprovado.\n" : "Aluno reprovado.\n";
		r += "\n";
		return r;
	}
}
