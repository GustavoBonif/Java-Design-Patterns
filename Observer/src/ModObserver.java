
	//Gustavo Bonifácio Conceição
	//BSI 2021.2

public class ModObserver implements Observer{
	
	private double resultMod;
	private Subject concreteSubject;
	
	public ModObserver(Subject concreteSubject) {
		this.concreteSubject = concreteSubject;
		concreteSubject.registerObserver(this);
	}
		
	public void update(int valor) {
		this.resultMod = valor * 2;
		
		display();
	}
	
	public void display() {
		System.out.println("Resultado da multiplicação = " + this.resultMod);
	}
}
