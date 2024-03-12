
public class Principal {
    public static void main(String[] args) {

        double areaDoQuadrado = CalculadoraDeArea.calcularAreaDeUmQuadrado(2);
        double areaDoCirculo = CalculadoraDeArea.calcularAreaDeUmCirculo(2);

        System.out.printf("Area do quadrado: %.2f%n", areaDoQuadrado);
        System.out.printf("Area do circulo: %.2f%n", areaDoCirculo);
    }
}
