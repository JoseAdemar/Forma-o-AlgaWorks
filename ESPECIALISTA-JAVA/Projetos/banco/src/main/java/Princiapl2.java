import com.aglaworks.banco.Conta;
import com.aglaworks.banco.ContaInvestimento;
import com.aglaworks.banco.Titular;

public class Princiapl2 {
    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "12312312300");
        ContaInvestimento conta1 = new ContaInvestimento(titular, 1234, 999999);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.creditarRendimentos(6);
        conta1.imprimirDemonstrativo();
    }

}
