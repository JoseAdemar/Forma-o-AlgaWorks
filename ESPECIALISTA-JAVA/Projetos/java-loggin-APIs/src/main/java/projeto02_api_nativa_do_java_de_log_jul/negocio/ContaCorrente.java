package projeto02_api_nativa_do_java_de_log_jul.negocio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import projeto02_api_nativa_do_java_de_log_jul.SaldoInsuficienteException;

import java.math.BigDecimal;
import java.util.Objects;

public class ContaCorrente {

    private static final Logger logger = LoggerFactory.getLogger(ContaCorrente.class.getName());

    private final Titular titular;
    private final int agencia;
    private final int numero;
    private BigDecimal saldo = BigDecimal.ZERO;

    public ContaCorrente(Titular titular, int agencia, int numero) {
        Objects.requireNonNull(titular);
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Titular getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public final BigDecimal getSaldo() {
        return saldo;
    }

    protected void validarSaldoParaSaque(BigDecimal valorSaque) {
        if (getSaldo().compareTo(valorSaque) < 0) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque");
        }
    }

    public void sacar(BigDecimal valorSaque) {
        logger.debug("Realizando saque...");
        Objects.requireNonNull(valorSaque);

        if (valorSaque.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
        }

        validarSaldoParaSaque(valorSaque);

        saldo = saldo.subtract(valorSaque);

        logger.info("Saque de R${} realizado na conta {}",
                valorSaque, getAgencia() + "/" + getNumero());
    }

    public final void depositar(BigDecimal valorDeposito) {
        logger.debug("Realizando depósito...");
        Objects.requireNonNull(valorDeposito);

        if (valorDeposito.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor do depósito deve ser maior que 0");
        }

        saldo = saldo.add(valorDeposito);

        logger.info("Depósito de R${} realizado na conta {}",
                valorDeposito, getAgencia() + "/" + getNumero());
    }

    public void imprimirDemonstrativo() {
        System.out.println();
        System.out.printf("Agência: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getNumero());
        System.out.printf("Titular: %s%n", getTitular().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular=" + titular +
                ", agencia=" + agencia +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaCorrente contaCorrente = (ContaCorrente) o;
        return agencia == contaCorrente.agencia && numero == contaCorrente.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencia, numero);
    }

}
