public class Principal {
    public static void main(String[] args) {

        CalculadoraImc calculadoraImc = new CalculadoraImc();
        Paciente joao = new Paciente();
        joao.altura = 1.70;
        joao.peso = 90;

        IndiceMassaCorporal imc = calculadoraImc.calcular(joao);

        if (imc.estaComObsidade()){
            System.out.printf("Paciente com %.2f de altura e peso de %.2f KG está com obsidade.%n",
                    joao.altura, joao.peso);
        }

        if (imc.estaAbaixoDoPesoIdeal()){
            System.out.printf("Paciente com %.2f de altura e peso de %.2f KG está abaixo do peso ideal.%n",
                    joao.altura, joao.peso);
        }
        System.out.printf("IMC = %.2f", imc.resultado);
    }
}
