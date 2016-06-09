package percursoEscolar;

import java.util.ArrayList;
import java.util.Date;

import disciplinas.Disciplina;

/**
 * Classe que representa um ciclo do ensino secundario.
 * Contem uma descricao do ciclo tirado.
 */
public class EnsinoSecundario extends CicloDeEducacao {

    /**
     * Default constructor
     */
    public EnsinoSecundario() {
    }

    public EnsinoSecundario(DescCursos descCiclo, 
						ArrayList<Disciplina> disciplinas, 
						Date dataDeFinalizacao) {
    }
    /**
     * Descricao do ciclo
     */
    protected DescCursos descCiclo;

    //acessores
	public DescCursos getDescCiclo() {
		return descCiclo;
	}

	public void setDescCiclo(DescCursos descCiclo) {
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