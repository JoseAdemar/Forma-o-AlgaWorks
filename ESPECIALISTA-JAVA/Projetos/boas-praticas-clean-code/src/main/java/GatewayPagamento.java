public class GatewayPagamento {

    public static boolean autorizarPagamento(String numeroCartao, double valorTotal){
       return numeroCartao != "" && valorTotal != 0.00 ? true : false;
    }
}
