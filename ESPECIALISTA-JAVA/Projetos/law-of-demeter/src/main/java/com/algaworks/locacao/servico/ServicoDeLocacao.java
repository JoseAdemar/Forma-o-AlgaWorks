package com.algaworks.locacao.servico;

import com.algaworks.locacao.Locacao;

public class ServicoDeLocacao {
    public void confirmarLocacao(Locacao locacao){
 /*               double totalDiarias = locacao.getVeiculo().getGrupo().getValorDiaria()
                        * locacao.getQuantidadeDiarias();

                double totalDiarias = locacao.getValorDiaria()
                * locacao.getQuantidadeDiarias();

                locacao.getVeiculo().setDisponivel(false);

         Código comentado acima não é uma boa prática*/

        double totalDiarias = locacao.calcularTotalDiarias();
        locacao.reservarVeiculo();
    }
}
