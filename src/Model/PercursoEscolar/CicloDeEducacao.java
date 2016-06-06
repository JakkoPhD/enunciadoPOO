package Model.PercursoEscolar; 

import java.util.*;
import avaliacoes.Avaliacao;

/**
 * 
 */
public abstract class CicloDeEducacao {

    /**
     * Default constructor
     */
    public CicloDeEducacao() {
    }

    /**
     * 
     */
    protected Set<Avaliacao> avaliacoes;

    /**
     * 
     */
    protected boolean aprovado;

    /**
     * 
     */
    protected Date dataFinalizacao;

    /**
     * 
     */
    protected String codCiclo;

    /**
     * 
     */
    protected Integer notaFinal;

}