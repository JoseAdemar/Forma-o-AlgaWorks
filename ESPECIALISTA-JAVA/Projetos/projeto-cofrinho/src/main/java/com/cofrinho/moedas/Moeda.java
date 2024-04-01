package com.cofrinho.moedas;

public abstract class Moeda {

    public double valor = 0.0;

    public abstract double converter(double valor);

    public abstract String info();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Moeda moeda = (Moeda) o;

        return Double.compare(moeda.valor, valor) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(valor);
        return (int) (temp ^ (temp >>> 32));
    }
}
