import com.algaworks.seguradora.model.Caminhao;
import com.algaworks.seguradora.model.CarroParticular;
import com.algaworks.seguradora.model.ImovelResidencial;
import com.algaworks.seguradora.servico.ServicoPropostaSeguro;

public class Principal {
    public static void main(String[] args) {

        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();
        ImovelResidencial imovel = new ImovelResidencial(2_300_000, 320);
        CarroParticular carroParticular = new CarroParticular("TOYTA", 80000, 2000);
        Caminhao caminhao = new Caminhao("Volvo", 250_000, 2022, 4);

        servicoPropostaSeguro.emitir(imovel);
        System.out.println("--------------------------");
        servicoPropostaSeguro.emitir(carroParticular);
        System.out.println("--------------------------");
        servicoPropostaSeguro.emitir(caminhao);
    }
}
