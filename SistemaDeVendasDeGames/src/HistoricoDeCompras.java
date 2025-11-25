import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HistoricoDeCompras {
    private Map<Integer, List<Venda>> historicoPorCliente;

    public HistoricoDeCompras() {
        this.historicoPorCliente = new HashMap<>();
    }

    public void adicionarCompra(int idCliente, Venda venda) {
        historicoPorCliente.computeIfAbsent(idCliente, k -> new ArrayList<>()).add(venda);
    }

    public void exibirHistoricoCliente(int idCliente) {
        List<Venda> compras = historicoPorCliente.get(idCliente);

        if (compras == null || compras.isEmpty()) {
            System.out.println("\nNenhuma compra registrada para o Cliente ID: " + idCliente);
            return;
        }

        System.out.println("\n--- HISTÓRICO DE COMPRAS - CLIENTE ID:\n" + idCliente + " ---");
        for (Venda venda : compras) {
            System.out.println(venda);
        }
        System.out.println("\n---------------------------------------------------\n");
    }
}