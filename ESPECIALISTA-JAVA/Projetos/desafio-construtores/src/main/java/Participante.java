import java.util.Objects;

public class Participante {
    String nome;
    int saldoDePontos;

    public Participante(String nome){
       this(nome,0);
    }

    public Participante(String nome, int saldoDePontos){
        Objects.requireNonNull(nome, "Nome nao pode ser nulo");
        if (saldoDePontos < 0 ){
            throw new IllegalArgumentException("Pontos nao pode ser negativo");
        }
        this.nome = nome;
        this.saldoDePontos = saldoDePontos;
    }
}
