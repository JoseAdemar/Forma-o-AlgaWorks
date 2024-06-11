package exercicio17;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;

public class Principal {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/main/java/exercicio17/docs/poema.txt");

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            reader.lines()
                    .forEach(System.out::println);
        }

//        ByteBuffer buffer = ByteBuffer.allocate(40);
//        try (var inputStream = new FileInputStream(path.toFile());
//            var channel = inputStream.getChannel()) {
//            while (channel.read(buffer) > 0) {
//                buffer.flip();
//                CharBuffer charBuffer = StandardCharsets.UTF_8.decode(buffer);
//                System.out.print(charBuffer);
//                buffer.clear();
//            }
//        }
    }

}