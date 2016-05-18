package enunciado;

public class Testes {

	public static void main(String[] args) {

		double[] testes = {10, 14, 12};
		double comportamento = 16;
		double trabalho = 10;
		boolean frequentou = false;
		Seminario s1 = new Seminario(testes, comportamento, trabalho, frequentou);
		
		System.out.println(s1.notaFinal());
		System.out.println(s1.indice());
		System.out.println(s1.isAprovado());
		System.out.println(s1);
		
		DisciplinaAnual a1 = new DisciplinaAnual(testes, comportamento, trabalho);
		
		System.out.println(a1.notaFinal());
		System.out.println(a1.indice());
		System.out.println(a1.isAprovado());
		System.out.println(a1);
		
		DisciplinaSemestral d1 = new DisciplinaSemestral(testes, comportamento);
		
		System.out.println(d1.notaFinal());
		System.out.println(d1.indice());
		System.out.println(d1.isAprovado());
		System.out.println(d1);
	}

}
