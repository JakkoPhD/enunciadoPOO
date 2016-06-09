package fichaAluno;

import java.util.ArrayList;

import informacoes.Informacoes;
import percursoEscolar.*;

/**
 * Classe que representa uma ficha de aluno.
 * Agrega informacoes pessoais assim como os
 * ciclos frequentados pelo aluno.
 */
public class FichaAluno {

	public FichaAluno() {
	}
	
	public FichaAluno(ArrayList<CicloDeEducacao> ciclosFrequentados,
					  Informacoes informacoes) {
	}
	// atributos
	/**
	 * Vetor que contem os ciclos de educacao frequentados
	 */
	protected ArrayList<CicloDeEducacao> ciclosFrequentados;
	
	/**
	 * Informacoes de identificacao do aluno
	 */
	protected Informacoes informacoes;

	// acessores
	public ArrayList<CicloDeEducacao> getCiclosFrequentados() {
		return ciclosFrequentados;
	}

	public void setCiclosFrequentados(ArrayList<CicloDeEducacao> ciclosFrequentados) {
		this.ciclosFrequentados = ciclosFrequentados;
	}

	public CicloDeEducacao getCicloDeEducacao(int index) {
		return ciclosFrequentados.get(index);
	}

	public void setCicloDeEducacao(int index, CicloDeEducacao cicloDeEducacao) {
		this.ciclosFrequentados.set(index, cicloDeEducacao);
	}

	public Informacoes getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(Informacoes informacoes) {
		this.informacoes = informacoes;
	}

}
