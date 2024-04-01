package com.algaworks.impostos;

public class EmpresaSimples extends PessoaJuridica{

    public double ALIQUOTA_IMPOSTO_FATURAMENTO = 0.06;

    public EmpresaSimples(String nome, double faturamentoAnual, double despesaAnual){
        super(nome, faturamentoAnual, despesaAnual);
    }

    @Override
    public double calcularImpostos() {
        return getFaturamentoAnual() * ALIQUOTA_IMPOSTO_FATURAMENTO;
    }

    @Override
    public void imprimirHistoricoImpostos() {
        super.imprimirHistoricoImpostos();
        System.out.println("Impostos: " + calcularImpostos());
        System.out.println("Faturamento anual: " + getFaturamentoAnual());
        System.out.println("Despesa anual: " + getDespesaAnual());
        System.out.println("Lucro anual: " + getLucroAnual());
    }
}
