public class Principal4 {
    public static void main(String[] args) {

        String[][] cidades = new String[3][];

        cidades[0] = new String[3];
        cidades[0][0] = "Uberlânida";
        cidades[0][1] = "Uberaba";
        cidades[0][2] = "Belo Horizonte";

        cidades[1] = new String[2];
        cidades[1][0] = "São Paulo";
        cidades[1][1] = "Ribeirão Preto";

        cidades[2] = new String[1];
        cidades[2][0] = "Fortaleza";


        for (int i = 0; i < cidades.length; i++) {
            for (int j = 0; j < cidades[i].length ; j++) {
                System.out.printf("[%d][%d] = %s%n", i, j, cidades[i][j]);
            }
        }

        System.out.println("--------------");

        for(String[] cidade : cidades) {
            for (String todasCidades : cidade){
                System.out.println(todasCidades);
            }
        }

    }
}
