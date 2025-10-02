class Pessoa {
    String nome;
    int idade;

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Matheus";
        pessoa1.idade = 25;
        
        pessoa1.mostrarInformacoes();
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Maria";
        pessoa2.idade = 10;

        pessoa2.mostrarInformacoes();
    }
}