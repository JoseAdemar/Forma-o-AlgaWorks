package com.cofrinho.moedas;

public class Dolar extends Moeda {

    @Override
    public double converter(double valor) {
        return valor * 4.98;
    }

    @Override
    public String info() {
        return "Dolar---> ";
    }
}
