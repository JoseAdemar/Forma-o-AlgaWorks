import java.util.Scanner;
public class EntradaDeDados {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome:");

        String nome = entrada.nextLine();
        
        System.out.println("O nome digitado foi: " + nome);

        System.out.println("Peso: ");
        int peso = entrada.nextInt();

        System.out.println("Altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("%.2f", imc);


    }

}