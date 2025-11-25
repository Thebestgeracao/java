public class Games {
    private String nome;
    private String genero;
    private int anoDeLancamento;
    private double preco;
    private String status; 

    public Games(String nome, String genero, int anoDeLancamento, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.anoDeLancamento = anoDeLancamento;
        this.preco = preco;
        this.status = "disponível"; 
    }

    public String getNome() { return nome; }
    public String getGenero() { return genero; }
    public int getAnoDeLancamento() { return anoDeLancamento; }
    public double getPreco() { return preco; }
    public String getStatus() { return status; }

    public void setNome(String nome) { this.nome = nome; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setAnoDeLancamento(int anoDeLancamento) { this.anoDeLancamento = anoDeLancamento; }
    public void setPreco(double preco) { this.preco = preco; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Gênero: " + genero + ", Ano: " + anoDeLancamento + ", Preço: R$ " + String.format("%.2f", preco) + ", Status: " + status;
    }
}