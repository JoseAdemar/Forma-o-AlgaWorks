import java.util.Scanner;
public class LoopDoWhileAula {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int quantidadeNumeros = 0;

       do {
          System.out.print("Quantidade de numeros: ");
          quantidadeNumeros = sc.nextInt();

       if (quantidadeNumeros < 6 || quantidadeNumeros > 15){
           System.out.println("Quantidade de numero dever ser entre 6 & 15");
         }
       } while (quantidadeNumeros < 6  || quantidadeNumeros > 15);

       
            int numeroAtual = 1;
            String numerosEscolhidos = "";

            do {
                System.out.printf("Numero %d/%d: ", numeroAtual, quantidadeNumeros);
                int numeroEscolhido = sc.nextInt();

                if (numeroEscolhido < 1 || numeroEscolhido > 60){
                    System.out.println("Numero dever ser de 1 a 60 ");
                } else {
                    numerosEscolhidos += numeroEscolhido + " ";
                    numeroAtual ++;
                }
             } while (numeroAtual <= quantidadeNumeros);
                System.out.printf("Numeros escolhidos: %s%n", numerosEscolhidos);
            }
       }
