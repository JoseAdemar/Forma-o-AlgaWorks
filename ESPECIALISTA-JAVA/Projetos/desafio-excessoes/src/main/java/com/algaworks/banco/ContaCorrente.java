package com.algaworks.banco;

public class ContaCorrente {
    private String numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public boolean isInativa() {
        return !isAtiva();
    }

    public void ativar() {
        this.ativa = true;
    }

    public void inativar() {
        this.ativa = false;
    }

    public boolean sacar(double valor) {

        if (valor <= 0) {
            throw new SacarException("Valor de saque deve ser maior que 0");
        }

        if (valor > this.saldo) {
            throw new SacarException("Conta sem saldo suficiente");
        }

        if (isInativa()) {
            throw new SacarException("Conta inativa");
        }

        this.saldo -= valor;
        return true;
    }

    public boolean depositar(double valor) {
        if (valor <= 0) {
            throw new DepositarException("Valor de depósito deve ser maior que 0");
        }

        if (isInativa()) {
            throw new DepositarException("Conta inativa");
        }

        this.saldo += valor;
        return true;
    }

    public boolean transferir(ContaCorrente contaDestino, double valor) {

        if (contaDestino.isInativa()) {
            throw new TransferirException("Conta de destino está inativa");
        }

        if (sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }

}