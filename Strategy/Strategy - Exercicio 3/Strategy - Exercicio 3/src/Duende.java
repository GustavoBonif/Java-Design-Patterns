
	//Gustavo Bonifácio Conceição
	//BSI 2021.2

public class Duende extends Personagem {
	
	public Duende() {
		arma = new Machado();
	}
	
	@Override
	public void lutar() {
		arma.usarArma();
	}
}
