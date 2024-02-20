import java.util.Scanner;
public class DesafioIfElseIMC {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Altura ?");
       double altura = sc.nextDouble();

       System.out.println("peso ?");
       int peso = sc.nextInt();

       System.out.println("Genero ? M OR F");
       char genero = sc.next().charAt(0);

       double imc = peso / (altura * altura);

       

       if (genero == 'f' && imc < 19.1){
          System.out.println(" Mulher voce esta Abaixo do peso " + imc );
       }else if (genero == 'm' && imc < 20.7){
          System.out.println(" Homen voce esta Abaixo do peso " + imc );
       }

       System.out.println(imc);

    }

}