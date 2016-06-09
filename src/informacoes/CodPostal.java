package informacoes;

/**
 * Classe que representa um codigo postal
 */
public class CodPostal {

    /**
     * Default constructor
     */
    public CodPostal() {
    }

    /**
     * Primeiros quatro numeros do codigo postal
     */
    protected int numZona;

    /**
     * Ultimos tres numeros do codigo postal
     */
    protected int numCasa;

    //acessores
	public int getNumZona() {
		return numZona;
	}

	public void setNumZona(int numZona) {
		this.numZona = numZona;
	}

	public int getNumCasa() {
		return numCasa;
	}

	public void setNumCasa(int numCasa) {
		this.numCasa = numCasa;
	}

	// metodos
	public void validarCodigoPostal() {
		
	}
}