package exercicio19;

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

        //        Files.writeString(path, "Opa!");

//        var linhas = Arrays.asList("Opa!", "Beleza, mergulhador?");
//        Files.write(path, linhas);

        byte[] bytes = { 79, 108, -61, -95 };
        Files.write(path, bytes);
    }

}