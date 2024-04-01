package com.algaworks.impostos;

public class EmpresaLucroReal extends PessoaJuridica{
    public static final double ALIQUOTA_IMPOSTO_LUCRO = 0.25;

    public EmpresaLucroReal(String nome, double faturamentoAnual, double despesaAnual){
        super(nome, faturamentoAnual, despesaAnual);
    }
    @Override
    public double calcularImpostos() {
        return getFaturamentoAnual() * ALIQUOTA_IMPOSTO_LUCRO;
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
