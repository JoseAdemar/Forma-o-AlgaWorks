package desafio;

import desafio.com.sistema.ServicoDeVenda;
import desafio.com.sistema.Venda;

import java.util.List;

public class Principal3 {
    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        vendas.stream()
                .filter(Venda::isFechada)
                .flatMap(venda -> venda.getItens().stream())
                .map(Venda.Item::descricao)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

}
