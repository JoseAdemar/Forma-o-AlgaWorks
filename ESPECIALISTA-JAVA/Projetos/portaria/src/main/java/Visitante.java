public class Visitante {

    static final  int IDADE_MINIMA = 18;

    String nome;
    int idade;

    boolean possuiAcessoRestritoPorIdade(){
        return idade < Visitante.IDADE_MINIMA;
    }
}
