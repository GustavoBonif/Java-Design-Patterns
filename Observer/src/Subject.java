
	//Gustavo Bonif�cio Concei��o
	//BSI 2021.2

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
