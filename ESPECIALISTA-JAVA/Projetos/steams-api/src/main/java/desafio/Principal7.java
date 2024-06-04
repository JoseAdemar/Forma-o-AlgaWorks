package desafio;

import desafio.com.sistema.ServicoDeVenda;
import desafio.com.sistema.Venda;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal7 {
    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        Map<String, Long> vendasRealizadasPorCliente = vendas.stream()
                .filter(Venda::isFechada)
                .collect(Collectors.groupingBy(venda -> venda.getCliente().nome(),
                        Collectors.counting()));
        System.out.println(vendasRealizadasPorCliente);
    }

}
