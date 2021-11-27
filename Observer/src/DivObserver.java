
	//Gustavo Bonif�cio Concei��o
	//BSI 2021.2

public class DivObserver implements Observer{
	
	private double resultDiv;
	private Subject concreteSubject;
	
	public DivObserver(Subject concreteSubject) {
		this.concreteSubject = concreteSubject;
		concreteSubject.registerObserver(this);
	}
		
	public void update(int valor) {
		this.resultDiv = valor / 2;
		
		display();
	}
	
	public void display() {
		System.out.println("Resultado da divis�o = " + this.resultDiv);
	}
}
