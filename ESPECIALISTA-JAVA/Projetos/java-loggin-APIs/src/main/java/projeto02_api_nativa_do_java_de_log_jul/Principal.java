package projeto02_api_nativa_do_java_de_log_jul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.logging.Level;
public class Principal {

    private static final Logger logger = LoggerFactory.getLogger(Principal.class.getName());

    public static void main(String[] args) {
        var titular = new Titular("João", "12312312399");
        var contaCorrente = new ContaCorrente(titular, 100, 9999);

        try {
            logger.debug("Manipulando conta corrente...");
            contaCorrente.depositar(new BigDecimal("200"));
            contaCorrente.sacar(new BigDecimal("50.5"));
//            contaCorrente.sacar(new BigDecimal("300"));
            contaCorrente.sacar(new BigDecimal("-10"));
        } catch (SaldoInsuficienteException e) {
            logger.warn("Pedido de saque com saldo insuficiente para conta "
                    + contaCorrente.getAgencia() + "/" + contaCorrente.getNumero(), e);
        } catch (Exception e) {
            logger.error("Erro administrando conta corrente "
                    + contaCorrente.getAgencia() + "/" + contaCorrente.getNumero(), e);
        }
    }
}