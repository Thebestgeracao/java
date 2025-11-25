import java.util.Scanner;

public class Jogos {
	private String nome;
	private String genero;
	private int anoDeLancamento;
	private double preco;
	private String status = "Disponível";
	public int escolhe;

	void CadastrarJogo() {
		Scanner leitor1 = new Scanner(System.in);
		System.out.println("\nNome: ");
		nome = leitor1.nextLine();
		System.out.println("Gênero:");
		genero = leitor1.nextLine();
		System.out.println("Ano de Lançamento:");
		if(leitor1.hasNextInt()) {
			anoDeLancamento = leitor1.nextInt();
		}else {
			System.out.println("Inválido. Cadastro cancelado.");
			leitor1.nextLine();
			return;
		}
		System.out.println("Preço: R$");
		if(leitor1.hasNextDouble()) {
			preco = leitor1.nextDouble();
		}else {
			System.out.println("Inválido. Cadastro cancelado.");
			leitor1.nextLine();
			return;
		}
		
		leitor1.nextLine();
		
		System.out.println("Status: " + status);
		
		System.out.println("\nJogo cadastrado com sucesso! ✔️");

		do {
			escolhe = 0;
			
			System.out.println("\nDeseja voltar ao menu, cadastrar outro jogo ou sair?");
			System.out.println("\nDigite 1 para voltar ao menu.");
			System.out.println("Digite 2 cadastrar outro.");
			System.out.println("Digite 3 para sair.");
			System.out.print("Escolha: ");

			if (leitor1.hasNextInt()) {
				escolhe = leitor1.nextInt();
				leitor1.nextLine();
			} else {
				System.out.println("Entrada Inválida ! Escolha as opções acima.");
			leitor1.next();
			leitor1.nextLine();
			escolhe = 0;
			continue;
			}
			
		switch (escolhe) {
		case 1:
			System.out.println("\nVoltando ao menu principal...");
			leitor1.locale();
			return;
		case 2:
			System.out.println("\nIniciando novo cadastro...");
			Jogos jogo1 = new Jogos();
			jogo1.CadastrarJogo();
            return;
		case 3:
			System.out.println("Saindo do sistema... Volte sempre! 👋😄");
			System.exit(0);
		default:
			System.out.println("Opção Inválida! Escolha um número entre 1 e 3. 🚫");
			}
		} while (escolhe < 1 || escolhe > 3);
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getEscolhe() {
		return escolhe;
	}

	public void setEscolhe(int escolhe) {
		this.escolhe = escolhe;
	}
		
}

