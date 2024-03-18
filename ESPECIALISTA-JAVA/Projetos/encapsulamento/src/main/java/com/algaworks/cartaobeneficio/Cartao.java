package com.algaworks.cartaobeneficio;

public class Cartao {
    public static final double VALOR_MINIMO_DEPOSITO = 50;
    public static  final double TARIFA_DEPOSITO = 0.10;

    private String titular;
    private double saldo;

    public Cartao(String titular){
        this.titular = titular;
    }

    public String obterTitular(){
        return  this.titular;
    }

    public double obterSaldo(){
        return this.saldo;
    }

    public void depositar(double valorDeposito){
        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO){
            throw new RuntimeException(String.format("Valor de deposito não pode ser " +
                    "menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO));
        }

        saldo += valorDeposito - TARIFA_DEPOSITO;
    }

    public void debitar(double valor){
        if (obterSaldo() < valor){
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }

        saldo -= valor;
    }
}
