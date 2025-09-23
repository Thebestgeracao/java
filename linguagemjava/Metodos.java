
public class Metodos {

	public void exibirMensagem() {
		System.out.println("Olá novamente...");
	}
	
	public int soma (int num1, int num2) {
		return num1 + num2;
	}
	
	public double calculaMedia (double num1, double num2) {
		return (num1 + num2) / 2;
	}
	
	public static String exibirMensagemArgumento(String mensagem) {
		String resultado = "A mensagem é: " + mensagem;
		return resultado;
	}
	
	public static void main(String[] args) {
		
		Metodos meuMetodo = new Metodos();
		meuMetodo.exibirMensagem();
		//exibirMensagem();
		System.out.println(meuMetodo.soma(3, 7));
		
		System.out.println(meuMetodo.calculaMedia(4, 6));
	}
}
