package com.exemplodeepycopy;

public class Pessoa implements Cloneable {
    String nome;
    Endereco endereco;

    Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Método para fazer uma deep copy
    @Override
    public Pessoa clone() {
        return new Pessoa(this.nome, this.endereco.clone());
    }
}
