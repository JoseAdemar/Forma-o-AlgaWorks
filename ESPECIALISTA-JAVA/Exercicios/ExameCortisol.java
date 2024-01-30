
import java.util.Scanner;
public class ExameCortisol {

    public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);

      System.out.print("Cortisol: ");
      double cortisol = sc.nextDouble();

      boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;
      System.out.printf("Resultado Normal = %b%n", resultadoNormal);

      boolean resultadoAnormal = cortisol < 6.0 || cortisol > 18.4;
      System.out.printf("Resultado Anormal = %b%n", resultadoAnormal);
  

    }

}