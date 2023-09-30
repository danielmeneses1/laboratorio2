package lab1;

public class Professor extends Cliente{
	private String nome;
	private int siaspe;
	
	public Professor(String nome, int siaspe) {
		this.nome = nome;
		this.siaspe = siaspe;
	}

	public String getNome() {
		return nome;
	}

	public int getsiaspe() {
		return siaspe;
	}
}
