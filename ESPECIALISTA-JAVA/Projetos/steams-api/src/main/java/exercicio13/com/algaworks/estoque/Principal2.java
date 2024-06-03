package exercicio13.com.algaworks.estoque;

import java.util.List;

public class Principal2 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        int maximoEstoque = 0;
        for (Produto produto : produtos) {
            if (produto.getQuantidade() > maximoEstoque) {
                maximoEstoque = produto.getQuantidade();
            }
        }

        System.out.println(maximoEstoque);
    }

}