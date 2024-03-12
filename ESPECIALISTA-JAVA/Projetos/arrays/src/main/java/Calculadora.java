public class Calculadora {

    public static double calcularMedia(int [] numeros){
        double total = 0;
       /* for (int i = 0; i < numeros.length; i ++){
            total += numeros[i];
        }*/

        for (int numero : numeros){
            total += numero;
        }
        return total / numeros.length;
    }
}
