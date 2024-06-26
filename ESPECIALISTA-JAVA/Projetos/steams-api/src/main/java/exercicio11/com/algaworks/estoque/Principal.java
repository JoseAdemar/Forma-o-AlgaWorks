package exercicio11.com.algaworks.estoque;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        produtos.stream()
                .filter(Produto::temEstoque)
                .flatMap(produto -> produto.getCategorias().stream())
                .distinct()
                .forEach(System.out::println);

//        Stream<Categoria> stream = produtos.stream()
//                .filter(Produto::temEstoque)
//                .flatMap(produto -> produto.getCategorias().stream())
//                .distinct();
//
//        stream.forEach(obj -> {
//            System.out.println(obj.getClass().getName() + " - " + obj);
//        });
    }

}