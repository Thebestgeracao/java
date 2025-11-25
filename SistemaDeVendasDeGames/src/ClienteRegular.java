import java.util.Scanner;

public class ClienteRegular {
	private String nome;
	private int idusuario;
	private String email;
	private double saldoDaConta;
	
	void FichaDeClienteRegular() {
		Scanner leitor2 = new Scanner(System.in);
		System.out.println("\n---- CADASTRO DE CLIENTE REGULAR ----");
		System.out.println("\nNome: ");
		nome = leitor2.nextLine();
		System.out.println("ID do Usuário: ");
		idusuario = leitor2.nextInt();
		System.out.println("Saldo da Conta");
		saldoDaConta = leitor2.nextDouble();
		leitor2.nextLine();
		System.out.println("\nCadastro realizado com sucesso. ✔️");
		System.out.println("Bem-vindo a família Ridiculous. 😁");

	}
}