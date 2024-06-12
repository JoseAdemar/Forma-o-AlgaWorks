package exercicio1;

import exercicio1.exercicio1.serializacao.Funcionario;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

/**
 * Serializando um objeto Java, nesse exemplo peguei um objeto instanciado
 * e joguei ele em um arquivo como bytes, serializar é pegar um objeto instanciado
 * e transformar ele em bytes.
 */
public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João",
                LocalDate.of(2005, Month.MARCH, 2),
                new BigDecimal("25000"));

        System.out.println(funcionario);

        Path path = Path.of("src/main/java/exercicio1/objetos/joao.ser");

//        try (var outputStream = new ObjectOutputStream(
//                new FileOutputStream(path.toFile()))) {
//            outputStream.writeObject(funcionario);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try (var outputStream = new ObjectOutputStream(
                Files.newOutputStream(path, WRITE, CREATE))) {
            outputStream.writeObject(funcionario);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
