package com.exemplodeepycopy;

public class Endereco {
    String rua;

    Endereco(String rua) {
        this.rua = rua;
    }

    // Método para clonar o endereço
    public Endereco clone() {
        return new Endereco(this.rua);
    }
}
