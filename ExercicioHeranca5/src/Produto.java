
public class Produto {

	private int identificador;
	private String nome;
	private double preco;
	
	public int getIdentificador() {
		if(this.identificador < 0)
			System.out.println("O identificador não poderá ser um número negativo");
		return identificador;
	}
	
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		if(this.preco < 1 || this.preco > 10000)
			System.out.println("O preço não poderá ser menor do que 1,00 nem maior do que 10.000,00");
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
