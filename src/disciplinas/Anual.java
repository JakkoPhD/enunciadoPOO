package disciplinas;

public class Anual extends Semestral {
	
	// ATRIBUTOS

	protected Nota trabalho;
	
	@Override
	public Nota notaFinal() {
		return new Nota(0.7 * super.notaFinal().getNota() + 
				        0.3 * trabalho.getNota());
	}
}
