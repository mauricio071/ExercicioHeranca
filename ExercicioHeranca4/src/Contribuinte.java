
public class Contribuinte {
	
	private double salario;
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void imposto() {
		if(this.salario <= 1164.00)
			System.out.println("ISENTO");
		else if(this.salario < 2326.00) {
			double imposto = (this.salario * 0.15) - 174.60;
			System.out.println("Imposto: R$" + imposto);
		}else {
			double imposto = (this.salario * 0.275) - 465.35;
			System.out.println("Imposto: R$" + imposto);
		}	
	}
}
