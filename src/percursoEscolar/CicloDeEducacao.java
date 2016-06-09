package percursoEscolar;

import java.util.ArrayList;
import java.util.Date;

import disciplinas.Disciplina;

/**
 * Classe abstrata que define os atributos principais
 * de um ciclo de educacao assim como os metodos essenciais.
 */
public abstract class CicloDeEducacao {

	/**
	 * Default constructor
	 */
	public CicloDeEducacao() {
	}
	
	// atributos
	
	/**
	 * Vetor que contem as disciplinas do ciclo
	 */
	protected ArrayList<Disciplina> disciplinas;

	/**
	 * Variavel de aprovacao, calculada apartir das notas e
	 * conforme as regras do ciclo
	 */
	protected boolean aprovado;

	/**
	 * Data em que foi obtida a aprovacao
	 */
	protected Date dataFinalizacao;

	/**
	 * Codigo interno que define o ciclo
	 */
	protected String codCiclo;

	/**
	 * Valor de nota final do ciclo
	 */
	protected float notaFinal;

	// acessores
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Disciplina getDisciplina(int index) {
		return disciplinas.get(index);
	}

	public void setDisciplina(int index, Disciplina disciplina) {
		this.disciplinas.set(index, disciplina);
	}

	public Date getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(Date dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public String getCodCiclo() {
		return codCiclo;
	}

	public float getNotaFinal() {
		return notaFinal;
	}

	// metodos	
	public abstract void calcularNotaFinal();

	/**
	 * verifica se o aluno foi aprovado apartir da notaFinal
	 */
	public abstract void verificarAprovacao();
	
	/**
	 * gera um codigo do ciclo de educacao em conformidade com alguns atributos
	 */
	public abstract void gerarCodCiclo();
	
}