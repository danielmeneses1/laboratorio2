package lab1;

import java.util.ArrayList;

public abstract class CachorroQuente {

	protected String queijo;
	protected ArrayList<String> ingredientes;
	protected String bebiba;
	protected double valor; 
	
	public CachorroQuente(String queijo) {
		this.queijo = queijo;		
	}
	
	public double getValor() {
		return valor;
	}


	public void adicionarIngredientes(String ingrediente) {
		
		ingredientes.add(ingrediente);
	}
}
