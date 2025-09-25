package outros;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome = "João Alfredo";
		String tipoConta = "Conta Corrente";
		double saldoInicial = 3000.00;
		int opcao = 0;
		
		
		System.out.println("Bank Account 🏦💰");
		System.out.println("\nNome: " + nome);
		System.out.println("Tipo de conta: " + tipoConta);
		System.out.println("Saldo Inicial: R$ " + saldoInicial);
		System.out.println("\n********************************");
		
		String menu = """
				
				Digite a opção desejada:
				
				1 - Consultar saldo
				2 - Tranferir valor
				3 - Receber valor
				4 - Sair
				""";
		
		while (opcao != 4) {
			System.out.println(menu);
			opcao = leitor.nextInt();
			
			if(opcao == 1) {
				System.out.println("O saldo é: " + saldoInicial);
			}else if (opcao == 2) {
				System.out.println("Qual o valor que deseja transferir? ");
				double valor = leitor.nextDouble();
				if (valor > saldoInicial) {
					System.out.println("Não há saldo para realizar ! 😭");
				}else {
					saldoInicial -= valor;
					System.out.println("Novo saldo: " + saldoInicial);
				}
			}else if (opcao == 3) {
				System.out.println("Valor recebido: ");
				double valor = leitor.nextDouble();
				saldoInicial += valor;
				System.out.println("Novo saldo: " + saldoInicial);
			}else if (opcao != 4) {
				System.out.println("Opção inválida. 👎");
			}
			
		}
	}
}

