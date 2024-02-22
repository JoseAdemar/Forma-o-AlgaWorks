
import java.util.Scanner;

public class DesafioDaEstruturaWhileIntermediario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numeroOriginal = numeroOriginal = entrada.nextInt();

        int numeroPendenteInversao = numeroOriginal;
        int numeroInvertido = 0;

        while (numeroPendenteInversao > 0) {
            int resto = numeroPendenteInversao % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            numeroPendenteInversao /= 10;
        }

        System.out.println("Inverso de " + numeroOriginal + " e " + numeroInvertido);
    }

}
