public class CalculadoraImc {

    IndiceMassaCorporal calcular(Paciente paciente){
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.altura = paciente.altura;
        imc.peso = paciente.peso;

        imc.resultado = imc.peso / (imc.altura * imc.altura);
        return imc;
    }
}

