import com.aglaworks.banco.Conta;
import com.aglaworks.banco.Titular;

public class Principal {
    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "12312312300");
        Conta conta1 = new Conta(titular, 1234, 999999);
        Conta conta2 = new Conta(titular, 1234, 999999);

        System.out.println(conta1.equals(conta2));
    }
}
