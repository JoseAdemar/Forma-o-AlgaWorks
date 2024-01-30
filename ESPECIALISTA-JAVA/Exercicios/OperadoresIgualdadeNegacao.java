public class OperadoresIgualdadeNegacao {

    public static void main(String[] args) {
       
       //boolean numerosIguais = 10 == 10;
       //boolean numerosIguais = (6 + 4) == (5 * 2);
       int numero1 = 10;
       int numero2 = 11;
       //boolean numerosDiferentes = numero1 == numero2;

       boolean numerosDiferentes = numero1 != numero2;

       boolean negacao = !numerosDiferentes;


       System.out.printf("Numeros diferentes = %b%n", numerosDiferentes);
       System.out.printf("Numeros diferentes = %b%n", negacao);

    }

}