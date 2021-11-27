
	//Gustavo Bonifácio Conceição
	//BSI 2021.2

public class TesteObserverExercicio {

	public static void main(String[] args) {
		ConcreteSubject concrete = new ConcreteSubject();
		
		DivObserver divObserver = new DivObserver(concrete);
		
		ModObserver modObserver = new ModObserver(concrete);
		
		System.out.println("Atenção! As operações são realizadas"
				+ "\ncom o a fórmula:  valor (operação) 2\n");
		concrete.getValor(50);
		System.out.println("\n ___________ \n");
		concrete.getValor(30);
		System.out.println("\n ___________ \n");
		concrete.getValor(70);

	}

}
