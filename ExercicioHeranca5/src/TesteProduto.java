
public class TesteProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		
		p1.setIdentificador(110);
		System.out.println("Identificador: " + p1.getIdentificador());
		
		p1.setPreco(-5);
		System.out.println("Preco: " + p1.getPreco());
	}

}
