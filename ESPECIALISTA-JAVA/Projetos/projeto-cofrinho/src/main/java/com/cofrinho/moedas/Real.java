package com.cofrinho.moedas;

public class Real extends Moeda{

    @Override
    public double converter(double valor) {
       return valor = valor;
    }

    @Override
    public String info() {
        return "Real--->";
    }
}
