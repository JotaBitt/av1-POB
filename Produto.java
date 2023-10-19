package av1Pob;

public class Produto {

	private String nome;
	private double valor;
	private int id;
	
	public Produto (int id, String nome, double valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
