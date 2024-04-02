package com.algaworks.modelo;

import com.algaworks.contaspagar.servico.com.aglaworks.pagamento.Beneficiario;
import com.algaworks.contaspagar.servico.com.aglaworks.pagamento.DocumentoPagavel;

public class OrdemServico implements DocumentoPagavel {

    private Beneficiario fornecedor;
    private double valorTotal;

    public OrdemServico(Beneficiario beneficiario, double valorTotal) {
        this.fornecedor = beneficiario;
        this.valorTotal = valorTotal;
    }

    public Beneficiario getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Beneficiario fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public double getValorTotal(){
        return this.valorTotal;
    }
    @Override
    public Beneficiario getBeneficiario() {
        return getFornecedor();
    }

}
