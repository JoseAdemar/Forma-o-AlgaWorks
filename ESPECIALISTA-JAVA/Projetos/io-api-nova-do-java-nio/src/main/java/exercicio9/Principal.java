package exercicio9;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;

public class Principal {

    public static void main(String[] args) throws IOException {
        Path pasta = Path.of("src/main/java/exercicio9/docs");

        try (var stream = Files.list(pasta)) {
            stream.filter(Files::isRegularFile)
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .filter(nome -> nome.matches(".*\\.txt"))
                    .forEach(System.out::println);
        }

    }

}