
	//Gustavo Bonifácio Conceição
	//BSI 2021.2

public class Rei extends Personagem {
	
	public Rei() {
		arma = new Faca();
	}
	
	@Override
	public void lutar() {
		arma.usarArma();
	}
}
