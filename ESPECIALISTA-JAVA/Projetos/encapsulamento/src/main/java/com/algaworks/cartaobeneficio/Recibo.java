package com.algaworks.cartaobeneficio;

public class Recibo {

    private String titular;
    private String descricao;
    private double valor;
    public Recibo(String titular, String descricao, double valor){
        this.titular = titular;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println("---------------");
        System.out.printf("RECIBO PARA %s%n", titular);
        System.out.printf("%s -> %.2f%n", descricao, valor);
        System.out.println("---------------");
    }
}
