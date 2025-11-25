public class DescontoClientePremium implements Desconto {
    @Override
    public double getPercentualDesconto(int tipoPagamento) {
        return switch (tipoPagamento) {
            case 1 -> 0.07; 
            case 2 -> 0.10; 
            case 3 -> 0.15; 
            case 4 -> 0.20;
            default -> 0.0;
        };
    }
}
