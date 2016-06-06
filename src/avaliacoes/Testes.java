package avaliacoes;

import java.util.ArrayList;

public class Testes {
	
	// ATRIBUTOS
	protected ArrayList<Nota> testes = new ArrayList();

	
	// GETS E SETS
	public ArrayList getTestes() {
		return testes;
	}
	
	public Nota getTeste(int index) {
		return testes.get(index);
	}

	public void setTestes(ArrayList<Nota> testes) {
		this.testes = testes;
	}
	
	public void setTeste(int index, Nota nota) {
		this.testes.set(index, nota);
	}
	
	public void add(Nota nota){
		this.testes.add(nota);
	}

	// MÉTODOS
	
	public char indice() {
		switch (mediaExtremos()) {
		case 0: case 1: case 2: case 3: case 4:
			return 'E';
		case 5: case 6: case 7: case 8: case 9:
			return 'D';
		case 10: case 11: case 12: case 13:
			return 'C';
		case 14: case 15: case 16: case 17:
			return 'B';
		case 18: case 19: case 20:
			return 'A';
		}
		return ' ';
	};

	public double media() {
		double media = 0;
		if (testes.size() > 0) {
			for (Nota nota : testes)
				media += nota.getNota();
			return media / testes.size();
		} else
			return 0;
	}

	protected int mediaExtremos() {
		return (int)((max() + min()) / 2);
	}

	protected double max() {
		double max = -1; 
		for (Nota nota : testes) {
			if (nota.getNota() > max)
				max = nota.getNota();
		}
		return max;
	}

	protected double min() {
		double min = 21; 
		for (Nota nota : testes) {
			if (nota.getNota() < min)
				min = nota.getNota();
		}
		return min;
	}
}
