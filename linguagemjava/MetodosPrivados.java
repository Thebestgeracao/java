
public class MetodosPrivados {
		
		// private void
		private void exibirMensagem() {
			System.out.println("Olá novamente....!");
		}
		
		// public int
		private int soma(int num1, int num2) {
			return num1 + num2;
		}
		
		// private double 
		private double calculaMedia(double num1, double num2) {
			return (num1 + num2) / 2;
		}
		
		private static String exibirMensagemArgumento(String mensagem) {
			String resultado = "A mensagem é: " + mensagem;
			return resultado;
		}
		
		private boolean logado() {
			boolean condicao = false;
			return condicao;
		}
	
	public static void main(String[] args) {
		
		MetodosPrivados metodos = new MetodosPrivados();
		metodos.exibirMensagem();
		System.out.println(metodos.calculaMedia(10, 9));

	}

}
