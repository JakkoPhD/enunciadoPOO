package percursoEscolar;

import java.util.Date;

/**
 * Classe que representa a finalizacao do periodo
 * pre-escolar.
 */
public class PreEscolar {

    /**
     * Default constructor
     */
    public PreEscolar() {
    }
    
    public PreEscolar(Date dataFinalizacao) {
    }

    /**
     * Data de finalizacao do pre-escolar
     */
    protected Date dataFinalizacao;

    //acessores
	public Date getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(Date dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

}