import java.util.Scanner;
public class DesafioEntradaDeDados {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nome:");
         String nome = entrada.nextLine();

         System.out.println("Valor por hora:");
           double valorPorHora = entrada.nextDouble();

           System.out.println("Horas trabalhadas:");
           int horasTrabalhadas = entrada.nextInt();

            System.out.println("Valor dos descontos:");
           double valorDosDescontos = entrada.nextDouble();

           double valorHorasTrabalhada = horasTrabalhadas * valorPorHora;

           double descontos = valorDosDescontos;

           double totalDevidos = valorHorasTrabalhada - descontos;

         
        
    System.out.printf("%nFolha de pagamento: %s%n", nome);
    System.out.printf("%d horas x R$%.2f = R$%.2f%n", 
        horasTrabalhadas, valorPorHora, valorHorasTrabalhada);
    System.out.printf("Descontos: R$%.2f%n", descontos);
    System.out.printf("Total devido: R$%.2f%n", totalDevidos);
        

        

    }

}