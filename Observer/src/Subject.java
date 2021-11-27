
	//Gustavo Bonifácio Conceição
	//BSI 2021.2

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
