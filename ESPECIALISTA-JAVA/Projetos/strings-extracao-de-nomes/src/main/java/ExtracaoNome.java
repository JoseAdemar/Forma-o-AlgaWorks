public class ExtracaoNome {
    public static void main(String[] args) {
        String nome = "João Silva Souza";
        String nome2 = "Maria";
        String nome3 = "João";
        System.out.println(nome2);
        nome2 = nome3;
        System.out.println(nome2);

        //System.out.println(obterSobreNome(nome));
        //System.out.println(obterSegundoNome(nome));
    }

    private static String obterSobreNome(String nome){
        if (nome.indexOf(" ") < 0){
            throw new RuntimeException("Não existe segundo nome");
        }
        int posicaoPrimeiroEspaco = nome.indexOf(" ");
        return nome.substring(posicaoPrimeiroEspaco);
    }

    private static String obterSegundoNome(String nome){
          int posicaoPrimeiroNome = nome.indexOf(" ");
          int posicaoSegundoNome = nome.indexOf(" ", posicaoPrimeiroNome + 1);

          if (posicaoPrimeiroNome < 0){
              throw new RuntimeException("Não é um nome completo");
          }
          return nome.substring(posicaoPrimeiroNome + 1, posicaoSegundoNome < 0 ? nome.length() : posicaoSegundoNome);
    }

}
