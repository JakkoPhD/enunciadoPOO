package informacoes;

/**
 * Classe que contem informacoes pessoais sobre o aluno
 */
public class Informacoes {

	/**
	 * Default constructor
	 */
	public Informacoes() {
	}

	//atributos
	protected String nome;
	protected Morada morada;
	protected String email;
	protected CartaoCidadao cartaoDeCidadao;
	protected int telefone;

	// acessores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Morada getMorada() {
		return morada;
	}

	public void setMorada(Morada morada) {
		this.morada = morada;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CartaoCidadao getCartaoDeCidadao() {
		return cartaoDeCidadao;
	}

	public void setCartaoDeCidadao(CartaoCidadao cartaoDeCidadao) {
		this.cartaoDeCidadao = cartaoDeCidadao;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

}