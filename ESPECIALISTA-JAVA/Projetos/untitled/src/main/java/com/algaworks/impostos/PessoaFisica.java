package com.algaworks.impostos;

public class PessoaFisica extends Pessoa {
    public static double RECEITA_ANUAL_ISENCAO = 50_000;
    public static final double ALIQUOTA_IMPOSTO_RENDA = 0.20;

    private double receitaAnual;

    public PessoaFisica(String nome, double receitaAnual) {
        super(nome);
        this.receitaAnual = receitaAnual;
    }

    public double getReceitaAnual() {
        return receitaAnual;
    }

    @Override
    public double calcularImpostos() {
        double valorImposto = 0;
        if (getReceitaAnual() > RECEITA_ANUAL_ISENCAO){
            valorImposto = getReceitaAnual() * ALIQUOTA_IMPOSTO_RENDA;
        }
        return valorImposto;
    }

    @Override
    public void imprimirHistoricoImpostos() {
        super.imprimirHistoricoImpostos();
        System.out.println("Receita anual:" + getReceitaAnual());
        System.out.println("Impostos pagos: " + calcularImpostos());
    }
}