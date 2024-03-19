package com.algaworks.financeiro;

public class ContaPagar {
    private String descricao;
    private double valor;
    private String dataVencimento;
    private boolean isPago;
    Fornecedor fornecedor;

    public void pagar(){
        if (isPago()){
            throw new RuntimeException("Conta já foi paga.");
        }

        this.isPago = true;
    }

    public void cancelarPagamento(){
        if (!isPago()){
           throw new RuntimeException("Pagamento já está cancelado");
        }
        this.isPago = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isPago() {
        return isPago;
    }

    public void setPago(boolean pago) {
        isPago = pago;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
