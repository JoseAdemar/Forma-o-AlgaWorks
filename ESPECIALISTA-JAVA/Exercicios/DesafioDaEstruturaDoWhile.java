
import java.util.Scanner;

public class DesafioDaEstruturaDoWhile {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean digitarProximo = true;
        int somaNumerosPares = 0;
        int somaNumerosImpares = 0;

        do {
            System.out.print("Digite um numero: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                somaNumerosPares += numero;
            } else {
                somaNumerosImpares += numero;
            }

            System.out.print("Deseja digitar outro numero? ");
            digitarProximo = entrada.nextBoolean();
        } while (digitarProximo);

        System.out.printf("Soma dos numeros pares: %d%n", somaNumerosPares);
        System.out.printf("Soma dos numeros ímpares: %d%n", somaNumerosImpares);
    }

}