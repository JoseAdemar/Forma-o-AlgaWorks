package com.exemploshallowcopy;

public class Pessoa implements Cloneable{
    String nome;
    Endereco endereco;

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public Pessoa clone() {
        try {
            Pessoa clone = (Pessoa) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
