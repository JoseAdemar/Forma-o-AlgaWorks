package com.algaworks.banco;

public class SacarException extends OperacaoBancariaException {


    public SacarException(String message, Throwable cause) {
        super(message, cause);
    }

    public SacarException(String message) {
        super(message);
    }

}
