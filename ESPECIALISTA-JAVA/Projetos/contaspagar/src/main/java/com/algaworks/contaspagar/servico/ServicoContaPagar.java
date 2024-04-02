package com.algaworks.contaspagar.servico;

import com.algaworks.contaspagar.servico.com.aglaworks.pagamento.Beneficiario;
import com.algaworks.contaspagar.servico.com.aglaworks.pagamento.DocumentoPagavel;
import com.algaworks.contaspagar.servico.com.aglaworks.pagamento.MetodoPagamento;

public class ServicoContaPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento){
        this.metodoPagamento = metodoPagamento;
    }
    public void pagar(DocumentoPagavel documento){
        metodoPagamento.pagar(documento);
    }
}
