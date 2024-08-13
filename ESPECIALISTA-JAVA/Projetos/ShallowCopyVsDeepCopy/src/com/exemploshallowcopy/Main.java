package com.exemploshallowcopy;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua A");
        Pessoa pessoa1 = new Pessoa("João", endereco);

        // Fazendo uma shallow copy de pessoa1
        Pessoa pessoa2 = pessoa1.clone();

        // Modificando o endereço de pessoa2
        pessoa2.endereco.rua = "Rua B";

        // Verificando os endereços
        System.out.println(pessoa1.endereco.rua); // Saída: Rua B
        System.out.println(pessoa1.nome);
        System.out.println("----------------------------------");
        System.out.println(pessoa2.endereco.rua); // Saída: Rua B
        System.out.println(pessoa2.nome);
    }
}
