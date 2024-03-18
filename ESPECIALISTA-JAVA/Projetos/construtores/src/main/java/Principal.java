import java.util.UUID;

public class Principal {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Picanha (1kg) peca");
        produto1.codigo = UUID.randomUUID().toString();

        System.out.println(produto1.nome);
        System.out.println("Quantidade em estoque: " + produto1.quantidadeEstoque + " Unidades." + produto1.codigo);
        System.out.println("--------------------------");

        Produto produto2 = new Produto();
        produto2.codigo = UUID.randomUUID().toString();
        System.out.println(produto2.nome);
        System.out.println(produto2.codigo);
        System.out.println("--------------------------");

        Produto produto3 = new Produto("Arroz", 150);
        produto3.codigo = UUID.randomUUID().toString();
        System.out.println(produto3.nome);
        System.out.println(produto3.codigo);
        System.out.println(produto3.quantidadeEstoque);



    }
}
