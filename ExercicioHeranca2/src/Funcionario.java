
public class Funcionario {
	
	private String nomeFunc;
	private String cargoFunc;
	private double salarioFunc;

	public String getNomeFunc() {
		return nomeFunc;
	}

	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public String getCargoFunc() {
		return cargoFunc;
	}

	public void setCargoFunc(String cargoFunc) {
		this.cargoFunc = cargoFunc;
	}

	public double getSalarioFunc() {
		return salarioFunc;
	}

	public void setSalarioFunc(double salarioFunc) {
		this.salarioFunc = salarioFunc;
	}
	
	public void reajuste(double valor) {
		double taxa = valor / 100;
		this.salarioFunc += this.salarioFunc * taxa;
		
	}
}
