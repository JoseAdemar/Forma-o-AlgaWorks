package com.algaworks.seguradora.model;

public class ImovelResidencial implements BemSeguravel{
    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = valorMercado * 0.001;
        valorPremio += areaConstruida * 0.3;
        return valorPremio;
    }

    @Override
    public String descrever() {
        return  String.format("Proposta de seguro%nValor de mercado: %.2f%nArea construída: %d m²%nValor prêmio: %.2f",
                valorMercado, areaConstruida, calcularValorPremio());
    }
}
