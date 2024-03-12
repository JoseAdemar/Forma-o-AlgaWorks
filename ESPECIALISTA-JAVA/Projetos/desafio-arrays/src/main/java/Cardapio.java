public class Cardapio {
    ItemCardapio[] itens;

    void adicionarItem(ItemCardapio item){
        itens = new ItemCardapio[0];
        itens[itens.length -1] = item;
        itens[itens.length + 1] = new ItemCardapio();

    }

    void removerItem(int indice){

    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo){

    }




}
