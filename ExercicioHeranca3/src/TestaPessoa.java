
public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Joao");
		p1.setIdade(22);
		p1.setPeso(70.0);
		p1.setAltura(1.70);
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("Peso: " + p1.getPeso());
		System.out.println("Altura: " + p1.getAltura());
		
		p1.calculaIMC();
	}

}
