package percursoEscolar;

import java.util.ArrayList;
import java.util.Date;

import disciplinas.Disciplina;

/**
 * Classe que representa um ciclo do ensino basico
 * Uma instanciacao desta classe representa apenas
 * um ciclo do ensino basico
 */
public class EnsinoBasico extends CicloDeEducacao {

	/**
	 * Default constructor
	 */
	public EnsinoBasico() {
	}
	
	public EnsinoBasico(DescCiclos descCiclo, 
						ArrayList<Disciplina> disciplinas, 
						Date dataDeFinalizacao) {
	}

	/**
	 * Descricao do ciclo
	 */
	protected DescCiclos descCiclo;

	// acessores
	public DescCiclos getDescCiclo() {
		return descCiclo;
	}

	public void setDescCiclo(DescCiclos descCiclo) {
		this.descCiclo = descCiclo;
	}

	// metodos
	public void calcularNotaFinal() {
		
	}

	public void verificarAprovacao() {
		
	}

	public void gerarCodCiclo() {
		
	}
}