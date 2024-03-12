public class CarrinhoDeCompra {

    final double TAXA_DE_SERVICO_PADRAO = 0.10;
    int quantidadeItem;
    Produto produto;

    public void realizarCompra(String numeroCartao){
        double subtotal = calcularValorTotal();
        double taxaServico = calcularValorDaTaxaDeServico(subtotal);
        double valorTotal = getValorTotal(subtotal, taxaServico);

        boolean pagamentoAutorizado = GatewayPagamento.autorizarPagamento(numeroCartao, valorTotal);

        if (pagamentoAutorizado){
            imprimirRecibo(valorTotal);
        }
    }

    private static void imprimirRecibo(double valorTotal) {
        System.out.println("RECIBO DE PAGAMENTO");
        System.out.printf("Valor total: R$%.2f", valorTotal);
    }

    private static double getValorTotal(double subtotal, double taxaServico) {
        double valorTotal = subtotal + taxaServico;
        return valorTotal;
    }

    private double calcularValorDaTaxaDeServico(double subtotal) {
        double taxaServico = subtotal * TAXA_DE_SERVICO_PADRAO;
        return taxaServico;
    }

    private double calcularValorTotal() {
        return produto.precoUnitario * quantidadeItem;
    }
}
