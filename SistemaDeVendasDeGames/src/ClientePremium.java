import java.util.Scanner;

public class ClientePremium {
	private String nomePremium;
	private int idusuarioPremium;
	private String emailPremium;
	private double saldoDaContaPremium;
	
	void FichaDeClientePremium() {
		Scanner leitor3 = new Scanner(System.in);
		System.out.println("\n---- CADASTRO DE CLIENTE PREMIUM ----");
		System.out.println("\nNome: ");
		nomePremium = leitor3.nextLine();
		System.out.println("ID do Usuário: ");
		idusuarioPremium = leitor3.nextInt();
		System.out.println("Saldo da Conta");
		saldoDaContaPremium = leitor3.nextDouble();
		leitor3.nextLine();
		System.out.println("\nCadastro realizado com sucesso. ✔️");
		System.out.println("Bem-vindo a família Ridiculous. 😁");

	}
}
