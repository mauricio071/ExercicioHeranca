
public class TestarAnimais {

	public static void main(String[] args) {
		
		Mamifero camelo = new Mamifero("Camelo", 150.0f, 4, "Amarelo", "Terra", 2.0f, null);
		Peixe tubarao = new Peixe("Tubar�o", 300.0f, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda");
		Mamifero ursocanada = new Mamifero("Urso-do-canad�", 180.0f, 4, "Vermelho", "Terra", 0.5f, "Mel");
		
		camelo.dadosMamifero();
		System.out.println("----------------------------------");
		tubarao.dadosPeixe();
		System.out.println("----------------------------------");
		ursocanada.dadosMamifero();
	}

}
