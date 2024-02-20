
import java.util.Scanner;
public class PrecedenciaOperadoresLogicos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Grupo de risco ?");
        boolean grupoDeRisco = sc.nextBoolean();

        System.out.println("Vitamina D ");
        double vitaminaD = sc.nextDouble();

        boolean vitaminaDNormal = (!grupoDeRisco && vitaminaD > 20) || (grupoDeRisco && vitaminaD >=30 && vitaminaD <=60);

        System.out.println(vitaminaDNormal);

    }

}