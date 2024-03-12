import java.util.Arrays;

public class Principal3 {
    public static void main(String[] args) {

        int[] numerosJogoAtual = {25, 11, 8, 46, 37, 14, 55};
        int[] numerosNovoJogoAtual = new int[numerosJogoAtual.length - 1];

        int indiceExclusao = 1;

        System.arraycopy(numerosJogoAtual, 0, numerosNovoJogoAtual, 0, indiceExclusao);

        System.arraycopy(numerosJogoAtual, indiceExclusao + 1, numerosNovoJogoAtual, indiceExclusao,
                numerosNovoJogoAtual.length - indiceExclusao);


        System.out.println(Arrays.toString(numerosJogoAtual));
        System.out.println(Arrays.toString(numerosNovoJogoAtual));
    }
}
