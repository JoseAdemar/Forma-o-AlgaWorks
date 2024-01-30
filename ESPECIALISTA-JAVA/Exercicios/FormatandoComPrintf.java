
import java.util.Locale;
public class FormatandoComPrintf {

    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        String nome1 = "Junior";
        System.out.printf("Olá, %s%n ", nome1);
        
        double peso = 80.22;
        System.out.printf("O peso = %.2f ", peso);

    }

}