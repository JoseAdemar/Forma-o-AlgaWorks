package com.algaworks.banco;

public class DepositarException extends OperacaoBancariaException {
    public DepositarException(String message, Throwable cause) {
        super(message, cause);
    }

    public DepositarException(String message) {
        super(message);
    }
}
