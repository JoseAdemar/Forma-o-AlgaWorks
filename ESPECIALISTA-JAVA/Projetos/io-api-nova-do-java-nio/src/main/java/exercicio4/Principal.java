package exercicio4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Principal {

    public static void main(String[] args) throws IOException {
        Path pastaFornecedores = Path.of("src/main/java/exercicio4/docs/contratos/fornecedores");
        Path arquivoContrato = Path.of("poema.txt");
        Path arquivoContratoOrigem = pastaFornecedores.resolve(arquivoContrato);

        Path pastaClientes = Path.of("src/main/java/exercicio4/docs/contratos/clientes");
        Path arquivoContratoDestino = pastaClientes.resolve(arquivoContrato);

        Path pastaParceiros = Path.of("src/main/java/exercicio4/docs/contratos/parceiros");

        System.out.println(arquivoContratoOrigem);
        System.out.println(arquivoContratoDestino);

        Files.copy(arquivoContratoOrigem, arquivoContratoDestino, REPLACE_EXISTING);
        Files.copy(pastaFornecedores, pastaParceiros);
    }

}