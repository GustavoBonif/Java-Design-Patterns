
	//Gustavo Bonifácio Conceição
	//BSI 2021.2

public class JogoTeste {
	
	public static void main(String[] args) {
	
		Guerreiro guerreiro = new Guerreiro();
		guerreiro.lutar();
		guerreiro.atribuitArma(new Faca());
		guerreiro.lutar();
		
		System.out.println("__________________\n");
		
		Duende duende = new Duende();
		duende.lutar();
		duende.atribuitArma(new ArcoeFlecha());
		duende.lutar();
		
		System.out.println("__________________\n");
		
		Rei rei = new Rei();
		rei.lutar();
		rei.atribuitArma(new Espada());
		rei.lutar();
		
		System.out.println("__________________\n");
		
		Rainha rainha = new Rainha();
		rainha.lutar();
		rainha.atribuitArma(new Machado());
		rainha.lutar();
		

	}

}
