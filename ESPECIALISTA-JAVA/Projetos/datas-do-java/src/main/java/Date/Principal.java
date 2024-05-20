import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        final long VINTE_QUATRO_HORAS = 24;
        final long SESSENTA_MINUTOS = 60;
        final long SESSENTA_SEGUNDOS = 60;
        final long MIL_MILESSEGUNDOS = 1000;

        Long dataEmMilesegundos = (VINTE_QUATRO_HORAS * SESSENTA_MINUTOS * SESSENTA_SEGUNDOS * MIL_MILESSEGUNDOS);
        Date data =  new Date(System.currentTimeMillis() - dataEmMilesegundos);
        System.out.println(data);
    }
}
