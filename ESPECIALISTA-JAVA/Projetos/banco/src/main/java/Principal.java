import com.aglaworks.banco.*;

public class Principal {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("João da Silva", "12312312300"),
                1234, 999999, 90);
        conta1.depositar(100);
        conta1.creditarRendimentos(10);
        conta1.setLimiteChequeEspecial(1000);

        ContaInvestimento conta2 = new ContaInvestimento( new Titular("Maria", "85847474859"),90888888, 4585);
        conta2.depositar(20);
        conta2.creditarRendimentos(10);

        ContaSalario conta3 = new ContaSalario(new Titular("Francisco Souza", "78978978955"),
                3333, 777777, 18_000);
        conta3.depositar(300);


        conta3.imprimirDemonstrativo();

        caixaEletronico.imprimirDemostrativo(conta3);
        System.out.println(conta3.getSaldo());
    }

}
