	//Gustavo Bonifácio Conceição
	//BSI 2021.2

public class Saque extends CondimentDecorator{
	protected Bebida bebida;
	
	public Saque(Bebida bebida){
		this.bebida = bebida;
	}
	
	public String getDescription() {
		return bebida.getDescription() + ", Saque";
	}
	
	public double cost() {
		return 2.50+ bebida.cost();
	}
}

