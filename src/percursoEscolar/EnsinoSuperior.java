package percursoEscolar;

import java.util.ArrayList;
import java.util.Date;

import disciplinas.Disciplina;

/**
 * Classe que representa um ciclo do ensino superior
 * Uma instanciacao desta classe representa um curso
 * tirado pelo aluno. Contem uma descricao do
 * estagio ou tese, se aplicavel.
 */
public class EnsinoSuperior extends CicloDeEducacao {

	/**
	 * Default constructor
	 */
	public EnsinoSuperior() {
	}

	public EnsinoSuperior(TiposCurso tipoCurso, 
						ArrayList<Disciplina> disciplinas, 
						Date dataDeFinalizacao,
						String orientadosEstagioTese,
						String descEstagioTese,
						String codCurso) {
	}
	/**
	 * Numero de creditos obtidos pela aprovacao do curso
	 */
	protected int creditos;

	/**
	 * Descricao do tipo de curso
	 */
	protected TiposCurso tipoCurso;

	/**
	 * Nome do Orientador do estagio ou tese de curso
	 */
	protected String orientadorEstagioTese;

	/**
	 * Descricao do estagio ou tese de curso
	 */
	protected String descEstagioTese;

	/**
	 * Codigo do curso. Pode ser consultado no site
	 * acessoensinosuperior.pt
	 */
	protected String codCurso;

	// acessores
	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public TiposCurso getTipoCurso() {
		return tipoCurso;
	}

	public void setTipoCurso(TiposCurso tipoCurso) {
		this.tipoCurso = tipoCurso;
	}

	public String getOrientadorEstagioTese() {
		return orientadorEstagioTese;
	}

	public void setOrientadorEstagioTese(String orientadorEstagioTese) {
		this.orientadorEstagioTese = orientadorEstagioTese;
	}

	public String getDescEstagioTese() {
		return descEstagioTese;
	}

	public void setDescEstagioTese(String descEstagioTese) {
		this.descEstagioTese = descEstagioTese;
	}

	public String getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}

	// metodos
	public void calcularNotaFinal() {
		
	}

	public void verificarAprovacao() {
		
	}

	public void gerarCodCiclo() {
		
	}
}