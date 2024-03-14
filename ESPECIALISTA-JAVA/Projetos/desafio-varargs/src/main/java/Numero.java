public class Numero {

    double valor1;
    double valor2;

    double calcularMedia(Numero numero, double... numerosAdicionais){
        double contador = 0;
        for (double adicionais : numerosAdicionais){
            contador += adicionais;
        }
        double totalNumerosDigitados = 2 + numerosAdicionais.length;
        return (numero.valor1 + numero.valor2 + contador) / totalNumerosDigitados;
    }
}
