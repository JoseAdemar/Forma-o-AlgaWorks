import java.util.Scanner;
public class LoopForAula {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Peso maximo da Aeronave: ");
       int pesoMaximo = sc.nextInt();

       System.out.print("Quantidade de passageiros: ");
       int totalPassageiros = sc.nextInt();

       int pesoTotalPassageiros = 0;

       for (int quantidadePassageiro = 1; quantidadePassageiro <= totalPassageiros; quantidadePassageiro ++){
            System.out.printf("Peso do passageiro #%d: ", quantidadePassageiro);
            int pesoPassageiro = sc.nextInt();
            pesoTotalPassageiros += pesoPassageiro;
       }
       
       System.out.printf("Peso maximo da aeronave: %d kg%n", pesoMaximo);
       System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiros);
       System.out.printf("Situacao da aeronave: %s%n", pesoTotalPassageiros > pesoMaximo ? "Peso excedido" : "Aeronave Liberada");

    }

}