import com.algaworks.contaspagar.servico.ServicoContaPagar;
import com.algaworks.contaspagar.servico.com.aglaworks.pagamento.*;
import com.algaworks.modelo.Holerite;
import com.algaworks.modelo.OrdemServico;

public class Principal {
    public static void main(String[] args) {

        Beneficiario funcionario = new Beneficiario("Maria", "7894", "4512");
        Holerite holerite = new Holerite(funcionario, 100, 10);
        DocumentoPagavel documento = holerite;
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(new Pix());
        servicoContaPagar.pagar(documento);

        System.out.println("--------------------------");

        Beneficiario fornecedor = new Beneficiario("Empresa XYZ","457480001", "45874");
        OrdemServico ordemServico = new OrdemServico(fornecedor, 160_000);
        DocumentoPagavel doc = ordemServico;
        ServicoContaPagar servicoContaPagarTransferencia = new ServicoContaPagar(new Transferencia());
        servicoContaPagarTransferencia.pagar(doc);

    }
}
