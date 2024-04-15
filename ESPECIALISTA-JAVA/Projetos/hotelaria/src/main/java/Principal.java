import com.aglaworks.agencia.CadastroHotel;
import com.aglaworks.agencia.Hotel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Principal {
    public static void main(String[] args) {
        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
        cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
        cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

        //cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);

       // ArrayList<Hotel> hoteis = cadastro.obterTodos();
//        int indice = hoteis.indexOf(new Hotel("Vila Selvagem", "Fortim/CE", 0));
       // int indice = hoteis.lastIndexOf(new Hotel("Vila Selvagem", "Fortim/CE", 0));
       // System.out.println(indice);

//        System.out.println(hoteis.get(indice));

       imprimirHoteis(cadastro.obterTodos());
    }

    private static void imprimirHoteis(ArrayList<Hotel> hoteis) {

        for(Hotel hotel : hoteis){
            System.out.println(hotel);
        }

        /*ListIterator<Hotel> hotelIterator = hoteis.listIterator(hoteis.size());

        while (hotelIterator.hasPrevious()) {
            System.out.println(hotelIterator.previous());
        }*/

       /* Iterator<Hotel> hotelIterator = hoteis.iterator();

        while (hotelIterator.hasNext()) {
            System.out.println(hotelIterator.next());
        }*/
        /*for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
                    hotel.getCidade(), hotel.getPrecoDiaria());
        }*/
    }

}