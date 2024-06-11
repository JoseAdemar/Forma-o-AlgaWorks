package exercicio6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Principal {

    public static void main(String[] args) throws IOException {
        Path arquivoContrato = Path.of("src/main/java/exercicio6/docs/contratos/fornecedores/poema.txt");
        Files.delete(arquivoContrato);
//        Files.deleteIfExists(arquivoContrato);

        Path pastaFornecedores = Path.of("src/main/java/exercicio6/docs/contratos/fornecedores");
        Files.delete(pastaFornecedores);

//        Path pastaClientes = Path.of("src/main/java/exercicio6/docs/contratos/contratos/clientes");
//        Files.delete(pastaClientes);
    }

}