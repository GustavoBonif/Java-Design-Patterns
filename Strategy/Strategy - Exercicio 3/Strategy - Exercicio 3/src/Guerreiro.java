
	//Gustavo Bonifácio Conceição
	//BSI 2021.2

public class Guerreiro extends Personagem {
	
	public Guerreiro() {
		arma = new Espada();
	}
	
	@Override
	public void lutar() {
		arma.usarArma();
	}
}
