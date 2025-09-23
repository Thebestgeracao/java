package CursoAlura;

import java.util.Scanner;
public class NumeroPositivo_NumeroNegativo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int number = 100;
		int contador = 0;
		
		while(contador < 1) {
			
			System.out.println("Digite um número: ");
			number = leitor.nextInt();
			contador++;
			
			if (number >= 0) {
				
				System.out.println("Número acima é Positivo.");
				
			}else {
				
				System.out.println("Número acima é Negativo.");
				
			}
			
			contador++;
		}
		
			
	}

}
