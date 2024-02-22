public class CalculadoraImpostoTernario {

    public static void main(String[] args) {
 
       char tipoNotaFiscal = 's';
       double totalFaturado = 1200.30;

       double valorImposto = tipoNotaFiscal == 's' ? totalFaturado * 0.16 : totalFaturado * 0.35;

       System.out.printf("Total faturado: R$%.2f%n", totalFaturado);
       System.out.printf("Valor dos impostos: R$%.2f%n", valorImposto);
    }
}