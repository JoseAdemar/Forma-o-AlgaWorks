package com.algaworks.modelo;

import com.algaworks.contaspagar.servico.com.aglaworks.pagamento.Beneficiario;
import com.algaworks.contaspagar.servico.com.aglaworks.pagamento.DocumentoPagavel;

public class Holerite implements DocumentoPagavel {

    private Beneficiario beneficiario;
    private double valorHora;
    private int quantidadeHoras;

    public Holerite(Beneficiario beneficiario, double valorHora, int quantidadeHoras) {
        this.beneficiario = beneficiario;
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
    }

    public Beneficiario getFuncionario(){
        return this.beneficiario;
    }
    public void setBeneficiario(Beneficiario beneficiario) {
        this.beneficiario = beneficiario;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    @Override
    public double getValorTotal() {
        return getValorHora() * getQuantidadeHoras();
    }

    @Override
    public Beneficiario getBeneficiario() {
        return getFuncionario();
    }
}
