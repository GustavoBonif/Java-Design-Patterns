	//Gustavo Bonifácio Conceição
	//BSI 2021.2

public class TesteDecorator {

	public static void main(String[] args) {
		
		Bebida caipira1 = new Caipira();
		caipira1 = new Saque(caipira1);
		caipira1 = new Abacaxi(caipira1);
		caipira1 = new Kiwi(caipira1);
		caipira1 = new Morango(caipira1);
		System.out.println(caipira1.getDescription() + " $" + caipira1.cost());
		
		Bebida caipira2 = new Caipira();
		caipira2 = new Vodka(caipira2);
		caipira2 = new Morango(caipira2);
		caipira2 = new Adocante(caipira2);
		System.out.println(caipira2.getDescription() + " $" + caipira2.cost());
		
		Bebida caipirinha = new Caipirinha();
		System.out.println(caipirinha.getDescription() + " $" + caipirinha.cost());

	}

}
