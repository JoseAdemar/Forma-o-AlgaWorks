package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SaudacaoUtilTest {

    @Test
    public void dado_um_horaio_matutino_entao_retornar_com_saudacao_bom_dia(){
        //Arrange
        int bomDia = 9;
        //Act
        String saudacao = SaudacaoUtil.saudar(bomDia);
        //Assert
        assertEquals("Bom dia", saudacao);
    }

    @Test
    void dado_um_horaio_vespertino_entao_retornar_com_saudacao_boa_tarde() {
        int boaTarde = 14;
        String saudar = SaudacaoUtil.saudar(boaTarde);
        assertEquals("Boa tarde", saudar);
    }


    @Test
    void dado_um_horaio_noturno_entao_retornar_com_saudacao_boa_noite() {
        int boaNoite = 18;
        String saudar = SaudacaoUtil.saudar(boaNoite);
        assertEquals("Boa noite", saudar);
    }

    @Test
    @DisplayName("Deve lançar exceção ao passar uma hora inválida.")
    public void deveLancarException(){
        int horaInvalida = -10;
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> SaudacaoUtil.saudar(horaInvalida));
        assertEquals("Hora invalida", illegalArgumentException.getMessage());
    }

    @Test
    @DisplayName("Deve não lançar exceção ao passar uma hora válida.")
    public void naoDeveLancarException(){
        int horaValida = 0;
        Executable validarChamadaDometodoSaudar = () -> SaudacaoUtil.saudar(horaValida);
        assertDoesNotThrow(validarChamadaDometodoSaudar);
    }
}
