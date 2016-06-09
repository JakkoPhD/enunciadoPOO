package informacoes;

/**
 * Classe que representa uma morada
 */
public class Morada {

	/**
	 * Default constructor
	 */
	public Morada() {
	}

	// atributos
	protected String rua;
	protected CodPostal codigoPostal;

	// acessores
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public CodPostal getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(CodPostal codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

}