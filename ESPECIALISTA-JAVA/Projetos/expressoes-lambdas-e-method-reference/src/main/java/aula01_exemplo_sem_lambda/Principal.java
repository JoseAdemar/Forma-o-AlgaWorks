package aula01_exemplo_sem_lambda;

import aula01_exemplo_sem_lambda.com.algaworks.crm.CadastroCliente;
import aula01_exemplo_sem_lambda.com.algaworks.crm.Cliente;
import aula01_exemplo_sem_lambda.com.algaworks.crm.Filtro;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        var cadastroCliente = new CadastroCliente();
        cadastroCliente.adicionar(new Cliente("João", 30));
        cadastroCliente.adicionar(new Cliente("Maria", 90));
        cadastroCliente.adicionar(new Cliente("Sebastião", 50));
        cadastroCliente.adicionar(new Cliente("Joaquina", 45));
        cadastroCliente.adicionar(new Cliente("Josefina", 25));

        //Classe anonima
        Filtro<Cliente> filtro = new Filtro<Cliente>() {
            @Override
            public boolean avaliar(Cliente cliente) {
                return cliente.getIdade() > 40;
            }
        };

        List<Cliente> clientes = cadastroCliente.consultar(filtro);

        for (Cliente cliente : clientes) {
            System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
        }
    }

}
