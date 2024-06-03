package exercicio13.com.algaworks.estoque;

import java.util.List;
import java.util.stream.IntStream;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        IntBinaryOperator operacaoSoma = (subtotal, valor) -> subtotal + valor;
//        int totalEstoque = produtos.stream()
//                .mapToInt(Produto::getQuantidade)
//                .reduce(0, operacaoSoma);
//        System.out.println(totalEstoque);

//        int totalEstoque = produtos.stream()
//                .mapToInt(Produto::getQuantidade)
//                .reduce(0, Integer::sum);
//        System.out.println(totalEstoque);

        int maximoEstoque = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .reduce(0, Integer::max);
        System.out.println(maximoEstoque);
    }

}