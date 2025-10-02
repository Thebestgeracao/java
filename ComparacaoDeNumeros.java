package CursoAlura;

import java.util.Scanner;

public class ComparacaoDeNumeros {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int number = 0;
		int number2 = 0;
		int contador = 0;
		
		while(contador < 1) {
			System.out.println("Digite o primeiro número: ");
			number = leitor.nextInt();
			System.out.println("Digite o segundo número:");
			number2 = leitor.nextInt();
			contador++;
				
				if (number == number2) {
					System.out.println("São iguais!!!!");
				}else if (number != number2 && number >= number2){
					System.out.println("São diferentes, o primeiro maior!!!!");
				}else {
					System.out.println("São diferentes, o segundo maior!!!!");
				}

		}
	}

}
