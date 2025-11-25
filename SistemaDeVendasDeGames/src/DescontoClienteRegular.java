public class DescontoClienteRegular implements Desconto {
    @Override
    public double getPercentualDesconto(int tipoPagamento) {
        return switch (tipoPagamento) {
            case 1 -> 0.05; 
            case 2 -> 0.07; 
            case 3 -> 0.10; 
            case 4 -> 0.15; 
            default -> 0.0;
        };
    }
}