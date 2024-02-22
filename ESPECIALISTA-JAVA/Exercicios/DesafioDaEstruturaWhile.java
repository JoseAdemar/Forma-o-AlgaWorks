
import java.util.Scanner;

public class DesafioDaEstruturaWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int somaNumeros = 0;

        while (somaNumeros < 100) {
            System.out.print("Digite um numero inteiro: ");
            int numeroInteiro = entrada.nextInt();
            somaNumeros += numeroInteiro;
        }

        System.out.printf("Soma dos numeros: %d%n ", somaNumeros);
    }

}


