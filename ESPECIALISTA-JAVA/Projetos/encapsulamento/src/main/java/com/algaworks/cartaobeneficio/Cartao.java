package com.algaworks.cartaobeneficio;

public class Cartao {
    public static final double VALOR_MINIMO_DEPOSITO = 50;
    public static  final double TARIFA_DEPOSITO = 0.10;

    private String titular;
    private double saldo;

    private boolean isAtivo;

    public Cartao(){

    }

    public Cartao(String titular){
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtivo() {
        return isAtivo;
    }

    public void depositar(double valorDeposito){
        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO){
            throw new RuntimeException(String.format("Valor de deposito não pode ser " +
                    "menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO));
        }

        saldo += valorDeposito - TARIFA_DEPOSITO;
    }

    public void debitar(double valor){
        if (getSaldo() < valor){
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }

        saldo -= valor;
    }
}
