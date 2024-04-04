package com.algaworks.locadora;

public class Locacao {
    private Notebook notebook;
    private Precificacao precificacao;
    private Seguro seguro;

    public Locacao(Notebook notebook, Precificacao precificacao) {
        this.notebook = notebook;
        this.precificacao = precificacao;
    }

    public Locacao(Notebook notebook, Precificacao precificacao, Seguro seguro) {
        this.notebook = notebook;
        this.precificacao = precificacao;
        this.seguro = seguro;
    }

    public boolean temSeguro() {
        return this.seguro != null;
    }

    public double calcularValorDevido(int horasUtilizadas) {
        double valorTotal = this.precificacao.calcularValorTotal(this.notebook, horasUtilizadas);

        if (temSeguro()) {
            valorTotal += this.seguro.calcularPremio(horasUtilizadas, valorTotal);
        }

        return valorTotal;
    }


}
