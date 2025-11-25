import java.util.ArrayList;
import java.util.List;

public class ArrayListClientes {
    private List<ClienteBase> listaClientes;

    public ArrayListClientes() {
        this.listaClientes = new ArrayList<>();
    }

    public void adicionarCliente(ClienteBase cliente) {
        listaClientes.add(cliente);
    }

    public ClienteBase buscarClientePorNome(String nome) {
        for (ClienteBase cliente : listaClientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                return cliente;
            }
        }
        return null;
    }
    
    public ClienteBase buscarClientePorId(int id) {
        for (ClienteBase cliente : listaClientes) {
            if (cliente.getIdCliente() == id) {
                return cliente;
            }
        }
        return null;
    }

    public boolean deletarCliente(String nome) {
        return listaClientes.removeIf(cliente -> cliente.getNome().equalsIgnoreCase(nome));
    }

    public void ListaDeClientes() {
        if (listaClientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        System.out.println("\n--- LISTA DE CLIENTES ---\n");
        for (ClienteBase cliente : listaClientes) {
            System.out.println(cliente);
        }
        System.out.println("\n-------------------------\n");
    }
    
    public void popularListaClientes() {
        listaClientes.add(new ClienteBase("João Silva", "Regular", "joao@gmail.com", "01/01/1990", "Masculino", 500.00));
        listaClientes.add(new ClienteBase("Maria Souza", "Premium", "maria@hotmail.com", "15/05/1995", "Feminino", 1000.00));
        listaClientes.add(new ClienteBase("Pedro Santos", "Premium", "pedro.santos@outlook.com", "04/06/2002", "Masculino", 2500.00));
        listaClientes.add(new ClienteBase("Ana Oliveira", "Regular", "ana.oliveira@yahoo.com", "19/03/2004", "Feminino", 700.00));
        listaClientes.add(new ClienteBase("Carlos Pereira", "Premium", "carlos.pereira@gmail.com", "20/05/1997", "Maculino", 4000.00));
        
    }
}