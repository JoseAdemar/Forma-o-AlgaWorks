package exercicios;

import java.time.LocalDateTime;

public class Principal14 {

    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime semanaPassada = agora
                .minusWeeks(1)
                .minusHours(10);

        System.out.println(agora);
        System.out.println(semanaPassada);
    }

}
