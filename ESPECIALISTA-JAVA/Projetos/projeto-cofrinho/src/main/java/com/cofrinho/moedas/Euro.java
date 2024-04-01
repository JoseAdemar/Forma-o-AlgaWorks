package com.cofrinho.moedas;

public class Euro extends Moeda {

    @Override
    public double converter(double valor) {
        return valor * 5.39;
    }

    @Override
    public String info() {
        return "Euro---> ";
    }
}
