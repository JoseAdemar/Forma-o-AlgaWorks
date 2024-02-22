import java.util.Scanner;

public class DesafioDaEstruturaForIntermediario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite dez numeros inteiros:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            
            if (isPrimo(numero)) {
                System.out.println(numero + " e um numero primo.");
            } else {
                System.out.println(numero + " nao e um umero primo.");
            }
        }
        
        scanner.close();
    }
    
    // Método para verificar se um número é primo
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
