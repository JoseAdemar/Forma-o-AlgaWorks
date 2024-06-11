package exercicio18;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/main/java/exercicio18/docs/poema.txt");

        //        try (var stream = Files.lines(path)) {
//            stream.forEach(System.out::println);
//        }

//        Files.readAllLines(path)
//                .forEach(System.out::println);

//        String conteudo = Files.readString(path);
//        System.out.println(conteudo);

        byte[] bytes = Files.readAllBytes(path);
        System.out.println(Arrays.toString(bytes));
    }

}