	//Gustavo Bonifácio Conceição
	//BSI 2021.2

public class Abacaxi extends CondimentDecorator{
	protected Bebida bebida;
	
	public Abacaxi(Bebida bebida) {
		this.bebida = bebida;
	}
	
	public String getDescription() {
		return bebida.getDescription() + ", Abacaxi";
	}
	
	public double cost() {
		return 0.80 + bebida.cost();
	}
}
