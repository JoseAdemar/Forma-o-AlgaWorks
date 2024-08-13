package exercicio01;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        while (true) {
            System.out.println("Informe um nome");
            String s = sc.nextLine();
            if (s.length() > 10) {
                s = s.substring(0, 10);
            }
            System.out.println("Informe um número natural");
            int x = sc.nextInt();
            sc.nextLine();

            System.out.println("Deseja continuar ? (s/n)");
            String continuar = sc.nextLine();
            if (!continuar.equalsIgnoreCase("s")){
                break;
            }
            // %s - string format, %-15s - left-justified string within 15 characters
            // %03d - integer with leading zeros to make it 3 digits
            System.out.printf("%-10s% 03d%n", s, x);
        }
    }
}
