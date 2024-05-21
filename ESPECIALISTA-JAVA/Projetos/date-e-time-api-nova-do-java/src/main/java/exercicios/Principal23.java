package exercicios;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Principal23 {
    public static void main(String[] args) {
        DayOfWeek diaDaSemanaHoje = LocalDate.now().getDayOfWeek();
        DayOfWeek diaDaSemanaQuinzeDias = diaDaSemanaHoje.plus(15);

        System.out.println(diaDaSemanaHoje);
        System.out.println(diaDaSemanaQuinzeDias);
    }

}
