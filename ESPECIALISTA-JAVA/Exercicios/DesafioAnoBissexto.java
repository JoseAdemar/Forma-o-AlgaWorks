
import java.util.Scanner;
public class DesafioAnoBissexto {

    public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);

      System.out.print("Ano: ");
      int ano = sc.nextInt();

      if (ano % 400 == 0 || ano % 4 == 0){
        System.out.printf("O ano %d e bissexto ", ano);
      }else{
        System.out.printf("O ano %d nao e um ano bissexto ", ano);

      }

    }

}