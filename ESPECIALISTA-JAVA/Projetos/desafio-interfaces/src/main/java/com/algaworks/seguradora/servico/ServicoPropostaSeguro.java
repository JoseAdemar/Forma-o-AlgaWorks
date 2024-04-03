package com.algaworks.seguradora.servico;

import com.algaworks.seguradora.model.BemSeguravel;

public class ServicoPropostaSeguro {
    public void emitir(BemSeguravel bemSeguravel){
        System.out.println(bemSeguravel.descrever());
    }
}
