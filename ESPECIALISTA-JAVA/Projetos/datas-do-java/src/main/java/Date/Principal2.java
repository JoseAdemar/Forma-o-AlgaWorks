import java.util.Date;

public class Principal2 {
    public static void main(String[] args) {

        final long VINTE_QUATRO_HORAS = 24;
        final long SESSENTA_MINUTOS = 60;
        final long SESSENTA_SEGUNDOS = 60;
        final long MIL_MILESSEGUNDOS = 1000;
        final long UM_DIA = 24;
        long DATA_EM_MILESEGUNDOS = (VINTE_QUATRO_HORAS * SESSENTA_MINUTOS * SESSENTA_SEGUNDOS * MIL_MILESSEGUNDOS);

        Date dataHoje = new Date();
        Date ontem = new Date(System.currentTimeMillis() - DATA_EM_MILESEGUNDOS);

        long diferencaEmMilesegundos = dataHoje.getTime() - ontem.getTime();
        System.out.println("Data de hoje em milesegundos = " + diferencaEmMilesegundos);

        double diferencaEmHoras = diferencaEmMilesegundos / MIL_MILESSEGUNDOS /  SESSENTA_MINUTOS / SESSENTA_SEGUNDOS ;
        System.out.printf(" Diferença em horas: %.2f%n ", diferencaEmHoras);

        long diferencaEmDias = diferencaEmMilesegundos / MIL_MILESSEGUNDOS /  SESSENTA_MINUTOS / SESSENTA_SEGUNDOS/ UM_DIA ;
        System.out.printf(" Diferença em dias: %d%n dia", diferencaEmDias);

        //Verifica se uma data é maior que outra
        System.out.printf("Data de hoje é depois da data informada ? %b%n ", dataHoje.after(ontem));

        //Verifica se uma data é menor que outra
        System.out.printf("Data de hoje é antes da data informada ? %b%n ", dataHoje.before(ontem));

        //Verifica se uma data é igual
        System.out.printf("Data de hoje é igual data informada ? %d%n ", dataHoje.compareTo(ontem));
    }
}
