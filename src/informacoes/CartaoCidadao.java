package informacoes;

import java.util.Date;

/**
 * Classe que representa um cartao de cidadao
 */
public class CartaoCidadao {

    /**
     * Default constructor
     */
    public CartaoCidadao() {
    }

    protected int nIdCivil;

    protected Date validade;

    protected Date dataDeNascimento;

    protected int nIdFiscal;

    protected int nSegSocial;

    protected int nUtenteSaude;

    protected String filiacao;

    protected String nome;

    protected boolean sexo;

    protected int altura;

    protected String nacionalidade;

    //acessores
	public int getnIdCivil() {
		return nIdCivil;
	}

	public void setnIdCivil(int nIdCivil) {
		this.nIdCivil = nIdCivil;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getnIdFiscal() {
		return nIdFiscal;
	}

	public void setnIdFiscal(int nIdFiscal) {
		this.nIdFiscal = nIdFiscal;
	}

	public int getnSegSocial() {
		return nSegSocial;
	}

	public void setnSegSocial(int nSegSocial) {
		this.nSegSocial = nSegSocial;
	}

	public int getnUtenteSaude() {
		return nUtenteSaude;
	}

	public void setnUtenteSaude(int nUtenteSaude) {
		this.nUtenteSaude = nUtenteSaude;
	}

	public String getFiliacao() {
		return filiacao;
	}

	public void setFiliacao(String filiacao) {
		this.filiacao = filiacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	// metodos
	public void lerCartaoCidadao() {
		
	}
	
	public void validarNumerosIdentificacao(int numIdentificacao) {
		
	}
	
	public void validarDataDeNascimento(Date dataDeNascimento) {
		
	}
}