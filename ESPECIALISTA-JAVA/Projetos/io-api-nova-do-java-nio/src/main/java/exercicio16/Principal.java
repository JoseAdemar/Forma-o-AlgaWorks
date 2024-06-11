package exercicio16;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.util.Arrays;

import static java.nio.file.StandardOpenOption.*;

public class Principal {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/main/java/exercicio16/docs/arquivo.txt");

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.put((byte) 79);
        buffer.put((byte) 108);
        buffer.put((byte) -61);
        buffer.put((byte) -95);

        System.out.println(Arrays.toString(buffer.array()));

        try (ByteChannel channel = Files.newByteChannel(
                path, WRITE, CREATE, TRUNCATE_EXISTING)) {
            buffer.flip();
//            System.out.println(buffer.position());
//            System.out.println(buffer.limit());
            channel.write(buffer);
        }
    }

}