import com.aglaworks.banco.Conta;
import com.aglaworks.banco.ContaEspecial;
import com.aglaworks.banco.Titular;

public class Principal3 {
    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "12312312300");
        ContaEspecial conta1 = new ContaEspecial(titular, 123, 999999, 90);

        conta1.setLimiteChequeEspecial(1000);


        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(200);
        conta1.imprimirDemonstrativo();

        conta1.debitarTarifaMensal();
        conta1.imprimirDemonstrativo();
    }

}