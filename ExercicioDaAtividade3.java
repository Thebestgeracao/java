class Produto {
    String nome;
    double preco;
    int quantidade;
    
    public double calcularValorTotal() {
        return preco * quantidade;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Produto produto1 = new Produto();
        produto1.nome = "Notebook";
        produto1.preco = 2500.0;
        produto1.quantidade = 6;

        double valorTotal1 = produto1.calcularValorTotal();
        System.out.println("Valor total em estoque do " + produto1.nome + ": R$ " + valorTotal1);

        Produto produto2 = new Produto();
        produto2.nome = "Smartphone";
        produto2.preco = 3000.0;
        produto2.quantidade = 5;

        double valorTotal2 = produto2.calcularValorTotal();
        System.out.println("Valor total em estoque do " + produto2.nome + ": R$ " + valorTotal2);
    }
}