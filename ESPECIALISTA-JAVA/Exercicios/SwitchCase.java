import java.util.Scanner;
public class SwitchCase {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("FAZ UMA AVALIACAO DE 1 - 5");
       System.out.println(" 1 é muito pessimo e 5 Excelente");
       int nota = sc.nextInt();

       switch (nota){
         case 1: System.out.println("Muito pessimo");
         break;
         case 2: System.out.println("ruim");
         break;
         case 3: System.out.println("razoavel");
         break;
         case 4: System.out.println("bom");
         break;
         case 5: System.out.println("Excelente");
         break;

         default:
            System.out.println("Opcao invalida!");

       }

    }

}