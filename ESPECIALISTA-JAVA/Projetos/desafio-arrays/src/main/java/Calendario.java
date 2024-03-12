public class Calendario {

    static final String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
            "Setembro", "Outubro", "Novembro", "Dezembro"};

    static String obterNomeMes(int numeroMes) {
        return numeroMes < 1 || numeroMes > 12 ? null : Calendario.meses[numeroMes - 1];
    }
}
