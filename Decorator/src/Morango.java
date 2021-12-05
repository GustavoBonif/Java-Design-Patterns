	//Gustavo Bonifácio Conceição
	//BSI 2021.2

public class Morango extends CondimentDecorator{
	protected Bebida bebida;
	
	public Morango(Bebida bebida) {
		this.bebida = bebida;
	}
	
	public String getDescription() {
		return bebida.getDescription() + ", Morango";
	}
	
	public double cost() {
		return 0.70 + bebida.cost();
	}
}
