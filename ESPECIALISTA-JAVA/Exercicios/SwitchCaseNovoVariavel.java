import java.util.Scanner;
public class SwitchCaseNovoVariavel {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("FAZ UMA AVALIACAO DE 1 - 5");
       System.out.println(" 1 é muito pessimo e 5 Excelente");
       int nota = sc.nextInt();

       System.out.println("Digite o numero 10");
       int valor = sc.nextInt();

        String resultado = switch (nota){
         case 1 -> "Muito pessimo";
          
         case 2 -> "ruim";
        
         case 3 -> "razoavel";
        
         case 4,5 -> "Excelente";
        
         case 6 -> {
            if (valor == 10){
               yield "TOP TOP";
            }
           yield "Super Excelente";
         }
        

         default -> "Opcao invalida!";

       };

       System.out.println(resultado);

    }

}