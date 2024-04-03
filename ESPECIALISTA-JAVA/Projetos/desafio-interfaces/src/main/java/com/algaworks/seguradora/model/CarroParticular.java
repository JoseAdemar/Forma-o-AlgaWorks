package com.algaworks.seguradora.model;

public class CarroParticular extends VeiculoAutomotor {
    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = getValorMercado() * 0.04;
        if (getAnoFabricacao() < 2000) {
            valorPremio *= 1.05;
        }
        return valorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Proposta de seguro%n Modelo: %s%n Valor de mercado%.2f%n" +
                        "Ano de fabrição: %d%nValor prêmio: %.2f",getModelo(), getValorMercado(), getAnoFabricacao(),
                calcularValorPremio());
    }
}
