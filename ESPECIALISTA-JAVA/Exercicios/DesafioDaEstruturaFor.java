
import java.util.Scanner;

public class DesafioDaEstruturaFor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int somaNumeros = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite um numero par: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                somaNumeros += numero;
            } else {
                i--;
            }
        }

        System.out.printf("Soma dos numeros pares: %d%n", somaNumeros);
    }

}


