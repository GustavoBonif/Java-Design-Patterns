	//Gustavo Bonifácio Conceição
	//BSI 2021.2

public class Vodka extends CondimentDecorator{
	protected Bebida bebida;
	
	public Vodka(Bebida bebida){
		this.bebida = bebida;
	}
	
	public String getDescription() {
		return bebida.getDescription() + ", Vodka";
	}
	
	public double cost() {
		return 1.50 + bebida.cost();
	}
}




