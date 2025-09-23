package outros.protegidos.subProtegidos;

import outros.protegidos.MetodosProtegidos;

public class TestaProtegidoDeFora extends MetodosProtegidos {
	
	
	public static void main(String[] args) {
		
		// MetodosProtegidos metodo = new metodosProtegidos();
		
		TestaProtegidoDeFora objetoTestaFora = new TestaProtegidoDeFora();
		System.out.println(objetoTestaFora.calculaMedia(10, 7));
		
		objetoTestaFora.exibirMensagem();
		
		objetoTestaFora.logado();
		
		System.out.println(objetoTestaFora.logado());
		
		System.out.println(objetoTestaFora.exibirMensagemArgumento("olá"));
		
		System.out.println(objetoTestaFora.numero);
		
		
	}

}
