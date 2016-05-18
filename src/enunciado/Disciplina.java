package enunciado;

import java.util.ArrayList;

abstract class Disciplina {

	// atributos
	protected ArrayList<Double> testes = new ArrayList<Double>();
	protected double comportamento;
	
	// metodos
	public abstract double notaFinal();
	
	public abstract char indice();
	
	public abstract boolean isAprovado();

}
