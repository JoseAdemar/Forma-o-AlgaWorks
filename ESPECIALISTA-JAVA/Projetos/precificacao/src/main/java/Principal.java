public class Principal {
    public static void main(String[] args) {

        Produto.custoEmbalagem = 10;
        Produto novoProduto = new Produto();
        //novoProduto.precoCusto = 100;
        novoProduto.alterarPrecoCusto(100);

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        novoProduto.alterarCustoEmbalagem(20);
        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);


        System.out.printf("Preço custo: %.2f%n", novoProduto.precoCusto);
        System.out.printf("Preço venda: %.2f%n", novoProduto.precoVenda);
    }
}
