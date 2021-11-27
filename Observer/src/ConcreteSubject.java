
	//Gustavo Bonifácio Conceição
	//BSI 2021.2

import java.util.ArrayList;

public class ConcreteSubject implements Subject {
	private ArrayList observers;
	private int valor;
	
	public ConcreteSubject() {
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i>=0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (int i=0; i<observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(this.valor);
		}
	}
	
	public void valorChanged() {
		notifyObservers();
	}
	
	public void getValor(int valor) {
		this.valor = valor;
		valorChanged();
	}
}
