	//Gustavo Bonifácio Conceição
	//BSI 2021.2

public class Kiwi extends CondimentDecorator{
	protected Bebida bebida;
	
	public Kiwi(Bebida bebida) {
		this.bebida = bebida;
	}
	
	public String getDescription() {
		return bebida.getDescription() + ", Kiwi";
	}
	
	public double cost() {
		return 1.20 + bebida.cost();
	}
}
