public class OperadoresComparacao {

    public static void main(String[] args) {
       
       int pesoProduto = 900;
       int limitePesoCaminhao = 1000;
       
       boolean cargaExcedida = pesoProduto > limitePesoCaminhao;
       boolean cargaLiberada = pesoProduto <= limitePesoCaminhao;


       System.out.printf("Carga Excedida = %b%n", cargaExcedida);
       System.out.printf("Carga Liberada = %b%n", cargaLiberada);
  

    }

}