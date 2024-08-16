package com.algaworks.comercial.servico;

import com.algaworks.comercial.entidade.Venda;
import com.algaworks.comercial.repositorio.mysql.MySQLFabricaDeRepositorio;
import com.algaworks.comercial.repositorio.VendaRepositorio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Properties;

public class CadastroVendaServico {
    private final VendaRepositorio vendaRepositorio;

    public CadastroVendaServico(VendaRepositorio vendaRepositorio){
        this.vendaRepositorio = vendaRepositorio;
    }
    public Venda cadastrar(String nomeCliente, BigDecimal valorTotal, LocalDate dataPagamento) {
        if (valorTotal.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NegocioException("Valor total deve ser maior que 0");
        }
        if (dataPagamento.isAfter(LocalDate.now())) {
            throw new NegocioException("Data do pagamento não pode ser uma data futura");
        }

        return vendaRepositorio.adicionar(new Venda(nomeCliente, valorTotal, dataPagamento));
    }

    public List<Venda> consultarCadastro() {
        var fab = new MySQLFabricaDeRepositorio(new Properties());
        return fab.criarVendaRepositorio().consultar();
    }
}
