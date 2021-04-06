
public class Pessoa {
	
	private String nome;
	private int idade;
	private double peso;
	private double altura;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void calculaIMC() {
		double imc = this.peso / (this.altura * this.altura);  
		System.out.println("IMC: " + imc);
		if(this.idade < 17)
			System.out.println("Muito abaixo do peso");
		else if(this.idade <= 18.49)
			System.out.println("Abaixo do peso");
		else if(this.idade <= 24.99)
			System.out.println("Peso normal");
		else if(this.idade <= 29.99)
			System.out.println("Acima do peso");
		else if(this.idade <= 34.99)
			System.out.println("Obesidade I");
		else if(this.idade <= 39.99)
			System.out.println("Obesidade II");
		else 
			System.out.println("Obesidade III");
	}
	
}
