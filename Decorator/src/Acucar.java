	//Gustavo Bonifácio Conceição
	//BSI 2021.2

public class Acucar extends CondimentDecorator{
	protected Caipira bebida;
	
	public Acucar(Caipira bebida) {
		this.bebida = bebida;
	}
	
	public String getDescription() {
		return bebida.getDescription() + ", Acucar";
	}
	
	public double cost() {
		return 0.20 + bebida.cost();
	}
}
