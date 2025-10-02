package outros;

public class ComandosDeRepeticao {

	public static void main(String[] args) {
		
		
		int contador = 1;
		
		// while
		while(contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		
		
		
		//do while
		int contadorDois = 1;
		do {
			System.out.println(contadorDois);
			contadorDois++;
			
		}while(contadorDois <= 10);

		
		
		// for
		for (int x = 1; x <= 10; x++) {
			System.out.println(x);	
		}
		
		
		// Arrays
		String[] frutas = {"Maça", "Melão", "Banana", "Abacate"};
		for (int x = 0; x < frutas.length; x++) {
			System.out.println(frutas[x]);
			
		}
		
	}

}
