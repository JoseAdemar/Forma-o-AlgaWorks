package com.algaworks.seguradora.model;

public class Caminhao extends VeiculoAutomotor{
    private int quantidadeEixos;
    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = getValorMercado() * 0.02;
        valorPremio += quantidadeEixos;
        return valorPremio ;
    }

    @Override
    public String descrever() {
        return  String.format("Proposta de seguro%n Modelo: %s%n Valor de mercado%.2f%n" +
                        "Quantidade de eixos: %d%n Ano de fabrição: %d%nValor prêmio: %.2f",getModelo(),getValorMercado(),
                quantidadeEixos,getAnoFabricacao(), calcularValorPremio());
    }
}
