package com.algaworks.agenda;

public class Agendamento {
    private final Horario horario;
    private String descricao;

    public  Agendamento(Horario horario, String descricao){
        this.horario = horario;
        this.descricao = descricao;
    }

    public Horario getHorario() {
        return horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHorarioFormatado() {
        return horario.formatar();
    }
}
