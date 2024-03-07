public class Produto {

    double precoCusto;
    double precoVenda;
    static double custoEmbalagem;



    /*Metodos estáticos não podem acessar membros de instância, somente se vinher através de parâmetros*/
    static double calcularCustosTotais(Produto produto){
        return produto.precoCusto + Produto.custoEmbalagem;
    }
    static void alterarCustoEmbalagem(double custoEmbalagem){
        Produto.custoEmbalagem = custoEmbalagem;
    }
    void alterarPrecoCusto(double precoCusto){
        this.precoCusto = precoCusto;
    }

    static void imprimirCustoEmbalagem(){
        System.out.printf("Custo com embalagem: %.2f%n", custoEmbalagem);
    }
}
