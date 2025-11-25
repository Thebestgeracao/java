import java.util.ArrayList;
import java.util.List;

public class ArrayListVendas {
    private List<Venda> historicoVendas;

    public ArrayListVendas() {
        this.historicoVendas = new ArrayList<>();
    }

    public void adicionarVenda(Venda venda) {
        historicoVendas.add(venda);
    }

    public void exibirHistorico() {
        if (historicoVendas.isEmpty()) {
            System.out.println("Nenhuma venda registrada ainda.");
            return;
        }
        System.out.println("\n--- HISTÓRICO DE VENDAS ---\n");
        for (Venda venda : historicoVendas) {
            System.out.println(venda);
        }
        System.out.println("---------------------------\n");
    }
}