package com.algaworks.contaspagar.servico.com.aglaworks.pagamento;

public interface DocumentoPagavel {

    public abstract double getValorTotal();

    Beneficiario getBeneficiario();
}
