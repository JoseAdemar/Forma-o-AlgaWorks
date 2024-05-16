import java.math.BigDecimal;

public class ContaCorrente {

    private BigDecimal saldo = BigDecimal.ZERO;

    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);
    }

    public void sacar(BigDecimal valorSaque) {
        int valorDoSaldo = 0;
        if (valorSaque.compareTo(saldo) > valorDoSaldo) {
            throw new RuntimeException(
                    String.format("Saque: %s, Saldo: %s", valorSaque, saldo));
        }

        saldo = saldo.subtract(valorSaque);
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

}