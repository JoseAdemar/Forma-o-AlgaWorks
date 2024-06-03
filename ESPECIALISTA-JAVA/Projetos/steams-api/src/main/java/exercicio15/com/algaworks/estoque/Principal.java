package exercicio15.com.algaworks.estoque;

import java.math.BigDecimal;
import java.util.List;
import java.util.OptionalInt;

public class Principal {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();
//        List<Produto> produtos = new ArrayList<>();

        OptionalInt maiorQuantidadeOptional = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .reduce(Integer::max);

        int maiorQuantidade = maiorQuantidadeOptional
                .orElseThrow(() -> new RuntimeException("Quantidade não encontrada"));

        System.out.println(maiorQuantidade);
    }

}