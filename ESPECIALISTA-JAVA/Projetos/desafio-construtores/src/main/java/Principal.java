public class Principal {
    public static void main(String[] args) {

        Participante participante1 = new Participante(null);
        System.out.println(participante1.nome);
        System.out.println("------------------------");

        Participante participante2 = new Participante("Maria", 800);
        System.out.println(participante2.nome);
        System.out.println(participante2.saldoDePontos);
    }
}
