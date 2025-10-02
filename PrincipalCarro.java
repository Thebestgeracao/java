package screenmatch;

public class PrincipalCarro {

	public static void main(String[] args) {
		Carro meuCarro = new Carro();
        meuCarro.modelo = "BMW X7";
        meuCarro.ano = 2017;
        meuCarro.cor = "Preto";

        meuCarro.exibeFichaTecnica();

        System.out.println("Idade do carro: " + meuCarro.calculaIdade() + " anos");
	}

}
