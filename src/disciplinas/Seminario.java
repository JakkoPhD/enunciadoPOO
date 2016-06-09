package disciplinas;

public class Seminario extends Anual {
	
	// ATRIBUTOS

	protected boolean assiduidade;
	
	// GETS E SETS

	public boolean isAssiduidade() {
		return assiduidade;
	}

	public void setAssiduidade(boolean assiduidade) {
		this.assiduidade = assiduidade;
	}	
	
	// MÉTODOS

	@Override
	public boolean aprovado() {
		return super.aprovado() && assiduidade ;
	}
	
}
