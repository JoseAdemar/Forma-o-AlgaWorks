public class Aeronave {

    boolean ativo = true;
    int totalAssentos;
    int assentosReservados;

    int calcularAssentosDisponiveis(){

        return totalAssentos - assentosReservados;
    }


    void reservarAssentos(int numeroDeAssentos){
        if (ativo){
            assentosReservados += numeroDeAssentos;
        } else{
            System.out.println("Aeronave desativada. Assentos não podem ser reservados.");
        }
    }

    boolean desativar(){
        return ativo = false;
    }

    boolean ativar(){
        return ativo = true;
    }

}
