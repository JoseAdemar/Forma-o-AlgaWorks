package com.algaworks.contaspagar.servico.com.aglaworks.pagamento;

public class Transferencia implements MetodoPagamento{
    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.naoPossuiContaBancaria()){
            throw new RuntimeException("Benificiário não possui conta bancária");
        }

        System.out.printf("DEBUG: Efetuando transferência para %s no valor de %.2f com a conta %s%n",
                beneficiario.getNome(), documento.getValorTotal(), beneficiario.getContaBancaria());
    }
}
