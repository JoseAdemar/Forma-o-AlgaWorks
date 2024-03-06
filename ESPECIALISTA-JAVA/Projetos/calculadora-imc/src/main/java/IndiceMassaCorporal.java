public class IndiceMassaCorporal {
    double resultado;
    double altura;
    double peso;

    boolean estaComObsidade(){
        return resultado >= 30;
    }

    boolean estaAbaixoDoPesoIdeal(){
        return resultado < 18.5;
    }
}
