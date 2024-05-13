package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void assercaoAgrupada(){
        Pessoa pessoa = new Pessoa("José", "Junior");

        assertAll("Asserções de pessoa",
                () -> assertEquals("José", pessoa.getNome()),
                () -> assertEquals("Junior", pessoa.getSobrenome()));
    }

}