package com.algaworks.junit.utilidade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaudacaoUtilTest {

    @Test
    public void saudarDeveRetornarAmensagemBomDia(){
        int bomDia = 9;
        String saudacao = SaudacaoUtil.saudar(bomDia);
        assertEquals("Bom dia", saudacao);
    }

    @Test
    void saudarDeveRetornarAmensagemBoaTarde() {
        int boaTarde = 14;
        String saudar = SaudacaoUtil.saudar(boaTarde);
        assertEquals("Boa tarde", saudar);
    }


    @Test
    void saudarDeveRetornarAmensagemBoaNoite() {
        int boaNoite = 18;
        String saudar = SaudacaoUtil.saudar(boaNoite);
        assertEquals("Boa noite", saudar);
    }

    @Test
    public void deveLancarException(){
        int hora = -10;
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> SaudacaoUtil.saudar(hora));
        assertEquals("Hora invalida", illegalArgumentException.getMessage());
    }

    @Test
    public void naoDeveLancarException(){
        int hora = 0;
        assertDoesNotThrow(() -> SaudacaoUtil.saudar(hora));
    }
}