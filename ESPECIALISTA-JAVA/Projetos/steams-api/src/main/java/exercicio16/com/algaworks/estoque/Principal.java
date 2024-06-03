package exercicio16.com.algaworks.estoque;

import java.util.List;
import java.util.OptionalInt;

public class Principal {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        int totalEstoque = produtos.stream()
//                .mapToInt(Produto::getQuantidade)
//                .sum();
////                .reduce(0, Integer::sum);
//        System.out.println(totalEstoque);

//        double mediaEstoque = produtos.stream()
//                .mapToInt(Produto::getQuantidade)
//                .average()
//                .orElseThrow(() -> new RuntimeException("Não há produtos para calcular a média"));
//        System.out.println(mediaEstoque);

        long totalProdutosComEstoque = produtos.stream()
                .filter(Produto::temEstoque)
                .count();
        System.out.println(totalProdutosComEstoque);
    }

}