import java.util.Objects;

public class Produto {
    final static int QUANTIDADE_PRODUTO_EM_ESTOQUE = 100;
    String nome;
    int quantidadeEstoque;

    public Produto(){
        this("nome");
    }
    public Produto(String nome){
        this(nome, QUANTIDADE_PRODUTO_EM_ESTOQUE);
    }

    public Produto(String nome, int quantidadeEstoque){
        Objects.requireNonNull(nome, "Nome nao pode ser nulo");
        this.nome = nome;
        if (quantidadeEstoque < 0 ){
            throw new IllegalArgumentException("Quantidade nao pode ser um valor negativo!");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
