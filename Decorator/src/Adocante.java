	//Gustavo Bonifácio Conceição
	//BSI 2021.2

public class Adocante extends CondimentDecorator{
	protected Bebida bebida;
	
	public Adocante(Bebida bebida) {
		this.bebida = bebida;
	}
	
	public String getDescription() {
		return bebida.getDescription() + ", Adocante";
	}
	
	public double cost() {
		return 0.25 + bebida.cost();
	}
}
