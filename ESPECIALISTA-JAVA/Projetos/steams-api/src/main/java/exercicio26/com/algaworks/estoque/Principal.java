package exercicio26.com.algaworks.estoque;

import java.util.Objects;
import java.util.Random;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {
        Stream.of("João", null, "Maria", null)
                .filter(Objects::nonNull)
                .forEach(System.out::println);
    }

}