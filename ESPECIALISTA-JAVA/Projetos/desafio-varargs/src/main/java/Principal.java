public class Principal {
    public static void main(String[] args) {

        Numero numero = new Numero();

        numero.valor1 = 8.5;
        numero.valor2 = 8.4;

        double media = numero.calcularMedia(numero, 8.6, 9.5);
        System.out.printf("Media = %.2f%n", media);

        System.out.println("--------------");

        double media2 = numero.calcularMedia(numero);
        System.out.printf("Media = %.2f%n", media2);
    }
}
