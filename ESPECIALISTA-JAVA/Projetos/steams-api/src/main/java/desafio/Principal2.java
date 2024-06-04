package desafio;

import desafio.com.sistema.Cliente;
import desafio.com.sistema.ServicoDeVenda;
import desafio.com.sistema.Venda;

import java.util.Comparator;
import java.util.List;

public class Principal2 {
    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        vendas.stream()
                .filter(Venda::isFechada)
                .map(Venda::getCliente)
                .distinct()
                .sorted(Comparator.comparing(Cliente::nome))
                .forEach(System.out::println);
    }

}
