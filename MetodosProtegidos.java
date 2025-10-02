package outros.protegidos;

public class MetodosProtegidos {

	protected int numero = 1000;
	// protected void
	protected void exibirMensagem() {
		System.out.println("Olá novamente....!");
	}

	// protected int
	protected int soma(int num1, int num2) {
		return num1 + num2;
	}

	// protected double
	protected double calculaMedia(double num1, double num2) {
		return (num1 + num2) / 2;
	}

	// protected String
	protected static String exibirMensagemArgumento(String mensagem) {
		String resultado = "A mensagem é: " + mensagem;
		return resultado;
	}

	// protected boolean
	protected boolean logado() {
		boolean condicao = false;
		return condicao;
	}

	public static void main(String[] args) {
		
		MetodosProtegidos metodo = new MetodosProtegidos();
		metodo.exibirMensagem();
		
	}
}
