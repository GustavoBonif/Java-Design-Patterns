
	//Gustavo Bonifácio Conceição
	//BSI 2021.2

public class Rainha extends Personagem {
	
	public Rainha() {
		arma = new ArcoeFlecha();
	}
	
	@Override
	public void lutar() {
		arma.usarArma();
	}
}
