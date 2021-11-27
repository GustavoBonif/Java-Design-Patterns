
	//Gustavo Bonifácio Conceição
	//BSI 2021.2

public abstract class Personagem {
	Arma arma;
	
	public abstract void lutar();
	
	public void atribuitArma(Arma arma) {
		this.arma = arma;
	}
	
}
