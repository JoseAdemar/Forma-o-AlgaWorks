package com.algaworks.banco;

public class TransferirException extends OperacaoBancariaException {
    public TransferirException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransferirException(String message) {
        super(message);
    }
}
