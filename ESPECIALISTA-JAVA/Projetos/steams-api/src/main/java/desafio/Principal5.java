package desafio;

import desafio.com.sistema.ServicoDeVenda;
import desafio.com.sistema.Venda;

import java.util.List;

public class Principal5 {
    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        int quantidadeItensVendidos = vendas.stream()
                .filter(Venda::isFechada)
                .flatMap(venda -> venda.getItens().stream())
                .mapToInt(Venda.Item::quantidade)
                .sum();
        System.out.println(quantidadeItensVendidos);
    }

}
