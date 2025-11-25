import java.util.ArrayList;
	
	public class ArrayListJogos {
		private ArrayList<Games> listaJogos = new ArrayList<>();
	
	    public void popularEstoque() {
	        listaJogos.add(new Games("The Witcher 3: Wild Hunt", "RPG", 2015, 119.99));
	        listaJogos.add(new Games("Red Dead Redemption 2", "Ação-Aventura", 2018, 209.99));
	        listaJogos.add(new Games("Cyberpunk 2077", "RPG de Ação", 2020, 149.80));
	        listaJogos.add(new Games("Elden Ring", "RPG de Ação", 2022, 100.00));
	        listaJogos.add(new Games("God of War", "Ação-Aventura", 2018, 250.00));
	        listaJogos.add(new Games("EA SPORTS™ Madden NFL 26", "Esporte", 2025, 300.00));
	        listaJogos.add(new Games("Street Fighter™ 6", "Luta", 2023, 89.50));
	        listaJogos.add(new Games("Max Payne 3", "Tiro em terceira pessoa", 2012, 99.50));
	    }
	
	    public void ListaDeJogos() {
	        System.out.println("\n🎮 LISTA DE JOGOS 🎮\n");
	        if (listaJogos.isEmpty()) {
	            System.out.println("Nenhum jogo cadastrado.");
	            return;
	        }
	        for (int i = 0; i < listaJogos.size(); i++) {
	            System.out.println((i + 1) + ". " + listaJogos.get(i).toString());
	        }
	        System.out.println("\n-----------------------------\n");
	    }
	    
	    public Games buscarJogoPorNome(String nomeJogo) {
	        for (Games jogo : listaJogos) {
	            if (jogo.getNome().equalsIgnoreCase(nomeJogo)) {
	                return jogo;
	            }
	        }
	        return null;
	    }
	    
	    public void adicionarJogo(Games novoJogo) {
	    	listaJogos.add(novoJogo);
	    }
	    
	    public boolean deletarJogo(String nomeJogo) {
	    	Games jogoParaDeletar = buscarJogoPorNome(nomeJogo);
	    	if (jogoParaDeletar != null) {
	    		listaJogos.remove(jogoParaDeletar);
	    		return true;
	    	}
	    	return false;
	    }
	}