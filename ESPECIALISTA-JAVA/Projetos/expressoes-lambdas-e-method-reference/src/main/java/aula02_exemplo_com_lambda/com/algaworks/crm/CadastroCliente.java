package aula02_exemplo_com_lambda.com.algaworks.crm;

import aula01_exemplo_sem_lambda.com.algaworks.crm.Cliente;
import aula01_exemplo_sem_lambda.com.algaworks.crm.Filtro;

import java.util.ArrayList;
import java.util.List;

public class CadastroCliente {
    private final List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void adicionar(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> consultar(Filtro<Cliente> filtro) {
        List<Cliente> clientesFiltrados = new ArrayList<>();

        for (Cliente cliente : clientes) {
            if (filtro.avaliar(cliente)) {
                clientesFiltrados.add(cliente);
            }
        }

        return clientesFiltrados;
    }

}
