package exercicio10;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;

public class Principal {

    //Encontrando arquivos apartir de um diretório principal e percorrendo todas as pastas abaixo

    public static void main(String[] args) throws IOException {
        Path pasta = Path.of("src/main/java/exercicio10/docs");

        try (var stream = Files.find(pasta, Integer.MAX_VALUE,
                (path, attrs) -> path.getFileName().toString()
                        .matches(".*\\.txt"))) {
            stream.forEach(System.out::println);
        }

    }

}