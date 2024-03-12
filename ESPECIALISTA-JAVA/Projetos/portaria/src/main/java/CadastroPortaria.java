public class CadastroPortaria {

    public static final int TEMPO_EXPIRACAO_PADRAO_EM_MESES = 1;

    void cadastrar(Visitante visitante){
        this.cadastrar(visitante, CadastroPortaria.TEMPO_EXPIRACAO_PADRAO_EM_MESES);
    }
    void cadastrar(final Visitante visitante, final int tempoExperiracaoEmMeses){
        final int tempoExperiracaoEmDias = tempoExperiracaoEmMeses * 30;
        System.out.printf("Visitante %s cadastrado para %d dias%n", visitante.nome, tempoExperiracaoEmDias);
    }
}
