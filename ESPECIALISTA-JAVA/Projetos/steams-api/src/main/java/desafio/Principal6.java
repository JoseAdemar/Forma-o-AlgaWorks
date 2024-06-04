package desafio;

import desafio.com.sistema.Cliente;
import desafio.com.sistema.ServicoDeVenda;
import desafio.com.sistema.Venda;

import java.util.List;
import java.util.stream.Collectors;

public class Principal6 {
    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        List<String> clientes = vendas.stream()
                .filter(Venda::isFechada)
                .map(Venda::getCliente)
                .map(Cliente::nome)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(clientes);
    }
}
