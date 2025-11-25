import java.util.Scanner;
import java.util.List; 

public class Cliente {

	private ArrayListJogos gerenciadorJogos = new ArrayListJogos();
	private ArrayListClientes gerenciadorClientes = new ArrayListClientes();
	private ArrayListVendas gerenciadorVendas = new ArrayListVendas();

	public Cliente() {
		gerenciadorJogos.popularEstoque();
		gerenciadorClientes.popularListaClientes();
	}

	void ExibirMenu() {
		Scanner leitor = new Scanner(System.in);

		int opcoes = 0;
		int selecionar;

		System.out.println("Seja bem-vindo ao Ridiculous Games Store 🎮😵‍💫");
		System.out.println("\n👾🎮 Menu 🧩🕹️");

		while (opcoes != 11) {
			String menu;
			menu = """
					\n1 - Cadastrar Jogo;
					2 - Cadastrar Cliente (Regular e Premium);
					3 - Editar Jogo;
					4 - Editar Cliente;
					5 - Deletar Jogo;
					6 - Deletar Cliente;
					7 - Listar Jogos;
					8 - Listar Clientes;
					9 - Realizar Venda;
					10 - Exibir Histórico de Compras;
					11 - Sair
					""";
			System.out.println(menu);

			System.out.println("\nEscolha uma opção:");

			if (leitor.hasNextInt()) {
				opcoes = leitor.nextInt();
				leitor.nextLine();
			} else {
				System.out.println("Opção Inválida. Por favor, selecione outra opção.");
				leitor.next();
				leitor.nextLine();
				continue;
			}

			switch (opcoes) {
			case 1:
				System.out.println("Carregando a opção: Cadastrar Jogos");
				System.out.println("\n--- Cadastro de Novo Jogo ---\n");
				System.out.println("Digite o Nome do Jogo:");
				String nomeNovoJogo = leitor.nextLine();

				System.out.println("Digite o Gênero:");
				String generoNovoJogo = leitor.nextLine();

					int anoNovoJogo = 0;
					System.out.println("Digite o Ano de Lançamento:");
					if (leitor.hasNextInt()) {
						anoNovoJogo = leitor.nextInt();
						leitor.nextLine();

						if (anoNovoJogo > 2025) {
							System.out.println("❌ ERRO: Ano de Lançamento não pode ser superior a 2025. O jogo não será cadastrado.");
							break;
						}
						
					} else {
						System.out.println("Entrada inválida para Ano de Lançamento. O jogo não será cadastrado. ❌");
						leitor.nextLine();
						break;
					}

				double precoNovoJogo = 0.0;
				System.out.println("Digite o Preço:");
				if (leitor.hasNextDouble()) {
					precoNovoJogo = leitor.nextDouble();
					leitor.nextLine();
				} else {
					System.out.println("Entrada inválida para Preço. O jogo não será cadastrado. ❌");
					leitor.nextLine();
					break;
				}

				Games novoJogo = new Games(nomeNovoJogo, generoNovoJogo, anoNovoJogo, precoNovoJogo);
				gerenciadorJogos.adicionarJogo(novoJogo);
				System.out.println("Jogo " + nomeNovoJogo + " cadastrado com sucesso! ✔️");
				break;
			case 2:
				System.out.println("Carregando a opção: Cadastrar Cliente (Regular ou Premium)");
				System.out.println("\n--- Cadastro de Novo Cliente ---");

				System.out.println("Digite o Nome do Cliente:");
				String nomeNovoCliente = leitor.nextLine();

				String tipoNovoCliente = "";
				System.out.println("\nQual tipo de cliente você deseja cadastrar?");
				System.out.println("1º) Cliente Regular");
				System.out.println("2º) Cliente Premium");
				System.out.println("\nEscolha uma opção (1 ou 2):");

				if (leitor.hasNextInt()) {
					selecionar = leitor.nextInt();
					leitor.nextLine();

					if (selecionar == 1) {
						tipoNovoCliente = "Regular";
					} else if (selecionar == 2) {
						tipoNovoCliente = "Premium";
					} else {
						System.out.println("Opção Inválida. O cliente será cadastrado como Regular por padrão.");
						tipoNovoCliente = "Regular";
					}

				} else {
					System.out.println("Entrada Inválida. O cliente será cadastrado como Regular por padrão.");
					leitor.next();
					leitor.nextLine();
					tipoNovoCliente = "Regular";
				}

				System.out.println("Digite o E-mail:");
				String emailNovoCliente = leitor.nextLine();

				System.out.println("Digite a Data de Nascimento (formato DD/MM/AAAA):");
				String dataNascimentoNovoCliente = leitor.nextLine();

				System.out.println("Digite o Sexo:");
				String sexoNovoCliente = leitor.nextLine();

				ClienteBase novoCliente = new ClienteBase(nomeNovoCliente, tipoNovoCliente, emailNovoCliente, dataNascimentoNovoCliente, sexoNovoCliente, 0.0);
				gerenciadorClientes.adicionarCliente(novoCliente);
				System.out.println(
						"Cliente " + nomeNovoCliente + " cadastrado como " + tipoNovoCliente + " com sucesso! ✔️");
				break;

			case 3:
				System.out.println("Carregando a opção: Editar Jogo");
				gerenciadorJogos.ListaDeJogos();

				System.out.println("Digite o nome do jogo que deseja editar:");
				String nomeJogo = leitor.nextLine();

				Games jogoParaEditar = gerenciadorJogos.buscarJogoPorNome(nomeJogo);

				if (jogoParaEditar != null) {
					System.out.println("\nJogo encontrado: \n" + jogoParaEditar.toString());
					System.out.println("\nQual campo deseja editar?");
					System.out.println("1 - Nome");
					System.out.println("2 - Gênero");
					System.out.println("3 - Ano de Lançamento");
					System.out.println("4 - Preço");
					System.out.println("5 - Cancelar Edição\n");

					if (leitor.hasNextInt()) {
						int campo = leitor.nextInt();
						leitor.nextLine();

						switch (campo) {
						case 1:
							System.out.println("Digite o novo Nome:");
							String novoNome = leitor.nextLine();
							jogoParaEditar.setNome(novoNome);
							System.out.println("Nome atualizado com sucesso! ✔️\n");
							break;
						case 2:
							System.out.println("Digite o novo Gênero:");
							String novoGenero = leitor.nextLine();
							jogoParaEditar.setGenero(novoGenero);
							System.out.println("Gênero atualizado com sucesso! ✔️\n");
							break;
						case 3:
							System.out.println("Digite o novo Ano de Lançamento:");
							if (leitor.hasNextInt()) {
								int novoAno = leitor.nextInt();
								leitor.nextLine();
								jogoParaEditar.setAnoDeLancamento(novoAno);
								System.out.println("Ano de Lançamento atualizado com sucesso! ✔️\n");
							} else {
								System.out.println("Entrada inválida para Ano de Lançamento. ❌");
								leitor.nextLine();
							}
							break;
						case 4:
							System.out.println("Digite o novo Preço:");
							if (leitor.hasNextDouble()) {
								double novoPreco = leitor.nextDouble();
								leitor.nextLine();
								jogoParaEditar.setPreco(novoPreco);
								System.out.println("Preço atualizado com sucesso! ✔️\n");
							} else {
								System.out.println("Entrada inválida para Preço. ❌");
								leitor.nextLine();
							}
							break;
						case 5:
							System.out.println("Edição cancelada. 🚫");
							break;
						default:
							System.out.println("Opção de campo inválida. 🚫");
						}

						if (campo >= 1 && campo <= 4) {
							System.out.println("\nNovo estado do jogo: \n" + jogoParaEditar.toString());
						}

					} else {
						System.out.println("Opção inválida. Retornando ao menu principal. 🔄");
						leitor.nextLine();
					}

				} else {
					System.out.println("Jogo com o nome " + nomeJogo + " não encontrado.");
				}
				break;
			case 4:
				System.out.println("Carregando a opção: Editar Cliente");
				gerenciadorClientes.ListaDeClientes();

				System.out.println("Digite o nome do cliente que deseja editar ou sair para cancelar:");
				String nomeCliente = leitor.nextLine();

				if (nomeCliente.trim().equalsIgnoreCase("sair")) {
					System.out.println("Edição de cliente cancelada. 🚫");
					break;
				}

				ClienteBase clienteParaEditar = gerenciadorClientes.buscarClientePorNome(nomeCliente);

				if (clienteParaEditar != null) {
					System.out.println("\nCliente encontrado: \n" + clienteParaEditar.toString());
					System.out.println("\nQual campo deseja editar?");
					System.out.println("1 - Nome");
					System.out.println("2 - Tipo");
					System.out.println("3 - E-mail");
					System.out.println("4 - Data de Nascimento");
					System.out.println("5 - Sexo");
					System.out.println("6 - Cancelar Edição\n");

					if (leitor.hasNextInt()) {
						int campo = leitor.nextInt();
						leitor.nextLine();

						switch (campo) {
						case 1:
							System.out.println("Digite o novo Nome:");
							String novoNome = leitor.nextLine();
							clienteParaEditar.setNome(novoNome);
							System.out.println("Nome atualizado com sucesso! ✔️");
							break;
						case 2:
							System.out.println("Digite o novo Tipo (Regular ou Premium):");
							String novoTipo = leitor.nextLine();
							clienteParaEditar.setTipo(novoTipo);
							System.out.println("Tipo atualizado com sucesso! ✔️");
							break;
						case 3:
							System.out.println("Digite o novo E-mail:");
							String novoEmail = leitor.nextLine();
							clienteParaEditar.setEmail(novoEmail);
							System.out.println("E-mail atualizado com sucesso! ✔️");
							break;
						case 4:
							System.out.println("Digite a nova Data de Nascimento (formato DD/MM/AAAA):");
							String novaDataNascimento = leitor.nextLine();
							clienteParaEditar.setdataDeNascimento(novaDataNascimento);
							System.out.println("Data de Nascimento atualizada com sucesso! ✔️");
							break;
						case 5:
							System.out.println("Digite o novo Sexo (Masculino, Feminino, Outro):");
							String novoSexo = leitor.nextLine();
							clienteParaEditar.setsexo(novoSexo);
							System.out.println("Sexo atualizado com sucesso! ✔️");
							break;
						case 6:
							System.out.println("Edição cancelada. 🚫");
							break;
						default:
							System.out.println("Opção de campo inválida. 🚫");
						}

						if (campo >= 1 && campo <= 5) {
							System.out.println("\nNovo estado do cliente: \n" + clienteParaEditar.toString());
						}

					} else {
						System.out.println("Opção inválida. Retornando ao menu principal. 🔄");
						leitor.nextLine();
					}

				} else {
					System.out.println("Cliente com o nome " + nomeCliente + " não encontrado.");
				}
				break;
			case 5:
				System.out.println("Carregando a opção: Deletar Jogo");
				gerenciadorJogos.ListaDeJogos();
				System.out.println("Digite o nome do jogo que deseja deletar:");
				String nomeJogoDeletar = leitor.nextLine();

				if (gerenciadorJogos.deletarJogo(nomeJogoDeletar)) {
					System.out.println("Jogo " + nomeJogoDeletar + " deletado com sucesso! 🗑️");
				} else {
					System.out
							.println("Jogo com o nome '" + nomeJogoDeletar + "' não encontrado. Nada foi deletado. ❌");
				}
				break;
			case 6:
				System.out.println("Carregando a opção: Deletar Cliente");
				gerenciadorClientes.ListaDeClientes();
				System.out.println("Digite o nome do cliente que deseja deletar:");
				String nomeClienteDeletar = leitor.nextLine();

				if (gerenciadorClientes.deletarCliente(nomeClienteDeletar)) {
					System.out.println("Cliente '" + nomeClienteDeletar + "' deletado com sucesso! 🗑️");
				} else {
					System.out.println(
							"Cliente com o nome '" + nomeClienteDeletar + "' não encontrado. Nada foi deletado. ❌");
				}
				break;
			case 7:
				System.out.println("\nCarregando a opção: Listar Jogos");
				gerenciadorJogos.ListaDeJogos();
				break;
			case 8:
				System.out.println("Carregando a opção: Listar Clientes\n");
				gerenciadorClientes.ListaDeClientes();
				break;
			case 9:
				System.out.println("Carregando a opção: Realizar Venda");

				gerenciadorClientes.ListaDeClientes();
				System.out.println("\nDigite o nome do cliente para a venda:");
				String nomeClienteVenda = leitor.nextLine();
				ClienteBase clienteVenda = gerenciadorClientes.buscarClientePorNome(nomeClienteVenda);

				if (clienteVenda == null) {
					System.out.println("Cliente não encontrado. Venda cancelada. ❌");
					break;
				}

				gerenciadorJogos.ListaDeJogos();
				System.out.println("\nDigite o nome do jogo a ser vendido:");
				String nomeJogoVenda = leitor.nextLine();
				Games jogoVenda = gerenciadorJogos.buscarJogoPorNome(nomeJogoVenda);

					if (jogoVenda == null) {
						System.out.println("Jogo não encontrado. Venda cancelada. ❌");
						break;
					}
					
					if (jogoVenda.getStatus().equalsIgnoreCase("vendido")) {
						System.out.println("❌ ERRO: O jogo '" + jogoVenda.getNome() + "' já foi vendido e não está disponível para compra.");
						break;
					}

				System.out.println("\nSelecione a forma de pagamento:");
				System.out.println("1 - Cartão de Crédito");
				System.out.println("2 - Boleto");
				System.out.println("3 - Cartão de Débito");
				System.out.println("4 - Pix");
				System.out.println("\nEscolha uma opção (1 a 4):");

				int tipoPagamento = 0;
				if (leitor.hasNextInt()) {
					tipoPagamento = leitor.nextInt();
					leitor.nextLine();
				} else {
					System.out.println("Opção de pagamento inválida. Venda cancelada. ❌");
					leitor.next();
					leitor.nextLine();
					break;
				}

				double precoOriginal = jogoVenda.getPreco();
				double percentualDesconto = 0.0;
				String tipoCliente = clienteVenda.getTipo();

				if (tipoCliente.equalsIgnoreCase("Regular")) {
					DescontoClienteRegular descontoRegular = new DescontoClienteRegular();
					percentualDesconto = descontoRegular.getPercentualDesconto(tipoPagamento);
				} else if (tipoCliente.equalsIgnoreCase("Premium")) {
					DescontoClientePremium descontoPremium = new DescontoClientePremium();
					percentualDesconto = descontoPremium.getPercentualDesconto(tipoPagamento);
				}

					double precoFinal = precoOriginal * (1 - percentualDesconto);

					if (!clienteVenda.debitarSaldo(precoFinal)) {
						System.out.println("\n❌ ERRO: Saldo insuficiente para a compra. Venda cancelada.");
						break;
					}

					jogoVenda.setStatus("vendido");

					Venda novaVenda = new Venda(clienteVenda.getNome(), jogoVenda.getNome(), precoOriginal, precoFinal,
							percentualDesconto, tipoCliente);

					gerenciadorVendas.adicionarVenda(novaVenda);

					System.out.println("\n--- VENDA REALIZADA COM SUCESSO! ---");
				System.out.printf("Cliente: %s (%s)\n", clienteVenda.getNome(), tipoCliente);
				System.out.printf("Jogo: %s\n", jogoVenda.getNome());
				System.out.printf("Preço Original: R$ %.2f\n", precoOriginal);
				System.out.printf("Desconto Aplicado: %.2f%%\n", percentualDesconto * 100);
				System.out.printf("Preço Final: R$ %.2f\n", precoFinal);
				System.out.println("-------------------------------------\n");
				break;
			case 10:
				System.out.println("Carregando a opção: Exibir Histórico de Compras");
				gerenciadorVendas.exibirHistorico();
				break;
			case 11:
				System.out.println("Saindo do sistema... Até mais! 👋😄");
				leitor.close();
				break;
			default:
				System.out.println("Opção Inválida! Escolha um número entre 1 e 11. 🚫");
			}
		}
	}
}
