
public class TestaClasses {

	public static void main(String[] args) {
		
		Metodos metodo = new Metodos();
		
		metodo.exibirMensagem();
		
		System.out.println(metodo.soma(34, 2));
		
		System.out.println(metodo.calculaMedia(2.5, 7.3));
		
		String palavra = "Alguma coisa";
		System.out.println(metodo.exibirMensagemArgumento(palavra));
		
		

	}  

}
