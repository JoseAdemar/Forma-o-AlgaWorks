import com.algaworks.financeira.modelo.Funcionario;
import com.algaworks.financeira.servico.ServicoPagamentoBonus;

public class Principal2 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João da Silva", 18_000);
        ServicoPagamentoBonus servicoPagamentoBonus = new ServicoPagamentoBonus();
        servicoPagamentoBonus.pagar(funcionario, 80);
    }
}
