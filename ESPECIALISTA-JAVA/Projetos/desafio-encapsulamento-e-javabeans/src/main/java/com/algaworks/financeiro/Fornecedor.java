package com.algaworks.financeiro;

public class Fornecedor {
    String nome;

    public Fornecedor(){

    }

    public Fornecedor(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
