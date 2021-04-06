
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setNomeFunc("Maurício");
		f1.setCargoFunc("Programador");
		f1.setSalarioFunc(5000);
		
		System.out.println("Nome: " + f1.getNomeFunc());
		System.out.println("Cargo: " + f1.getCargoFunc());
		System.out.println("Salario: " + f1.getSalarioFunc());
		
		System.out.println("-----------------------------");
		
		f1.reajuste(15);
		
		System.out.println("Nome: " + f1.getNomeFunc());
		System.out.println("Cargo: " + f1.getCargoFunc());
		System.out.println("Salario: " + f1.getSalarioFunc());
	}

}
