package exercicio17.com.algaworks.estoque;

import java.util.Comparator;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        int menorQuantidadeEstoque = produtos.stream()
//                .filter(Produto::temEstoque)
//                .mapToInt(Produto::getQuantidade)
//                .min()
//                .orElseThrow(() -> new RuntimeException("Menor quantidade não encontrada"));
//        System.out.println(menorQuantidadeEstoque);

        Produto produtoMaisBarato = produtos.stream()
                .filter(Produto::temEstoque)
                .min(Comparator.comparing(Produto::getPreco))
                .orElseThrow(() -> new RuntimeException("Produto mais barato não encontrado"));
        System.out.println(produtoMaisBarato);
    }

}