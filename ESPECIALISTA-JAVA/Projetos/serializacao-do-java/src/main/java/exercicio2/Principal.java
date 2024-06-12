package exercicio2;

import exercicio1.exercicio1.serializacao.Funcionario;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;

import static java.nio.file.StandardOpenOption.*;

/**
 * Deserializando um objeto Java, nesse exemplo peguei um objeto instanciado
 * e joguei ele em um arquivo como bytes, serializar é pegar um objeto instanciado
 * e transformar ele em bytes. Agora vou ler o arquivo que está em bytes.
 */
public class Principal {

    public static void main(String[] args) {
        Path path = Path.of("src/main/java/exercicio2/objetos/joao.ser");

        try (var inputStream = new ObjectInputStream(Files.newInputStream(path, READ))) {
            Funcionario funcionario = (Funcionario) inputStream.readObject();
            System.out.println(funcionario);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
