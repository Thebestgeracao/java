package outros;
import java.util.Scanner;

public class ComandosDeEntrada {
	
	public static void main(String[] args) {
		
		int vInteiro;
		double vDouble;
		String vString;
		String vFrases;
		float vFloat;
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		//System.out.printf("Informe uma frase: ");
		//vFrases = entrada.nextLine();
		//System.out.print("A frase é: " + vFrases);
		
		//System.out.printf("Informe uma palavra: ");
		//vString = entrada.next();
		//System.out.print("A frase é: " + vString);
		
		//System.out.printf("Informe um inteiro: ");
		//vInteiro = entrada.nextInt();
		//System.out.print("O inteiro é: " + vInteiro);
		
		//System.out.printf("Informe um double: ");
		//vDouble = entrada.nextDouble();
		//System.out.print("O inteiro é: " + vDouble);
		
			System.out.printf("Informe um float: ");
			vFloat = entrada.nextFloat();
			System.out.print("O float é: " + vFloat);
		
	} 

}
