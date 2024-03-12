public class Principal {
    public static void main(String[] args) {
        Visitante visitante = new Visitante();

        visitante.idade = 26;
        visitante.nome = "João";

        if (visitante.possuiAcessoRestritoPorIdade()) {

            System.out.printf("Visitante não possui idade mínima para ter acesso" +
                    " ao local, idade mínima =  %d %s", Visitante.IDADE_MINIMA, "anos");
        } else {
            System.out.println("Visitante com acesso liberado!!");
        }

        CadastroPortaria cadastroPortaria1 = new CadastroPortaria();
        CadastroPortaria cadastroPortaria2 = new CadastroPortaria();

        cadastroPortaria1.cadastrar(visitante, 10);
        cadastroPortaria2.cadastrar(visitante);

    }
}
