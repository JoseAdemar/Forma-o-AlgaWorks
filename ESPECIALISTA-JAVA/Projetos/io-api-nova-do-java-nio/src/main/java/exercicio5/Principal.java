package exercicio5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Principal {

    public static void main(String[] args) throws IOException {
        Path pastaFornecedores = Path.of("src/main/java/exercicio5/docs/contratos/fornecedores");
        Path pastaClientes = Path.of("src/main/java/exercicio5/docs/contratos/clientes");
        Path arquivoContrato = Path.of("poema.txt");

        Path arquivoContratoOrigem = pastaFornecedores.resolve(arquivoContrato);
        Path arquivoContratoDestino = pastaClientes.resolve(arquivoContrato);

        Files.move(arquivoContratoOrigem, arquivoContratoDestino);

//        Path pastaVendas = Path.of("docs/vendas");
//        Files.move(pastaClientes, pastaVendas);
    }

}