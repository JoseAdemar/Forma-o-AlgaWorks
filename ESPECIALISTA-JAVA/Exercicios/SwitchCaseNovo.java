import java.util.Scanner;
public class SwitchCaseNovo {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("FAZ UMA AVALIACAO DE 1 - 5");
       System.out.println(" 1 é muito pessimo e 5 Excelente");
       int nota = sc.nextInt();

       switch (nota){
         case 1 -> System.out.println("Muito pessimo");
          
         case 2 -> System.out.println("ruim");
        
         case 3 -> System.out.println("razoavel");
        
         case 4,5 -> System.out.println("Excelente");
        
         case 6 -> System.out.println("Super Excelente");
        

         default ->
            System.out.println("Opcao invalida!");

       }

    }

}