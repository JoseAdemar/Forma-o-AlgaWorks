package exercicios;

import java.time.LocalDate;
import java.time.Period;

public class Principal18 {

    public static void main(String[] args) {
        Period tempoMedioEntrega = Period.parse("P1M5D");
        LocalDate hoje = LocalDate.now();
        LocalDate dataPrevistaEntrega = hoje.plus(tempoMedioEntrega);

        System.out.println(hoje);
        System.out.println(dataPrevistaEntrega);
    }

}
