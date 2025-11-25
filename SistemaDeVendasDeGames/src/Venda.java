import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Venda {
    private String nomeCliente;
    private String nomeJogo;
    private double precoOriginal;
    private double precoFinal;
    private double descontoAplicado;
    private String tipoCliente;
    private LocalDateTime dataHoraVenda;

    public Venda(String nomeCliente, String nomeJogo, double precoOriginal, double precoFinal, double descontoAplicado, String tipoCliente) {
        this.nomeCliente = nomeCliente;
        this.nomeJogo = nomeJogo;
        this.precoOriginal = precoOriginal;
        this.precoFinal = precoFinal;
        this.descontoAplicado = descontoAplicado;
        this.tipoCliente = tipoCliente;
        this.dataHoraVenda = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = dataHoraVenda.format(formatter);
        
        return String.format("Data: %s \nCliente: %s (%s) \nJogo: %s \nPreço Original: R$ %.2f \nDesconto: %.2f%% \nPreço Final: R$ %.2f\n", dataFormatada, nomeCliente, tipoCliente, nomeJogo, precoOriginal, descontoAplicado * 100, precoFinal);
    }
}