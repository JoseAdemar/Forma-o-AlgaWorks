public class Principal {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Picanha (1kg) peca");

        System.out.println(produto1.nome);
        System.out.println("Quantidade em estoque: " + produto1.quantidadeEstoque + " Unidades.");
        System.out.println("--------------------------");

        Produto produto2 = new Produto();
        System.out.println(produto2.nome);
        System.out.println("--------------------------");

        Produto produto3 = new Produto("Arroz", 150);
        System.out.print(produto3.nome);
        System.out.println(produto3.quantidadeEstoque);

    }
}
