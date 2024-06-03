package exercicio19.com.algaworks.estoque;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toCollection;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        List<Categoria> categorias = produtos.stream()
                .filter(Produto::temEstoque)
                .flatMap(produto -> produto.getCategorias().stream())
                .distinct()
                .collect(toCollection(ArrayList::new));
//                .collect(toList());
//                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        System.out.println(categorias);
    }

}