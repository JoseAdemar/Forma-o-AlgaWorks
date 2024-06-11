package exercicio14;

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
        Path path = Path.of("src/main/java/exercicio14/docs/poema.txt");

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        try (ByteChannel channel = Files.newByteChannel(path, StandardOpenOption.READ)) {
            channel.read(buffer);

            buffer.flip();
//            System.out.println(buffer.position());
//            System.out.println(buffer.limit());

            CharBuffer charBuffer = StandardCharsets.UTF_8.decode(buffer);
            System.out.print(charBuffer);
        }
    }

}