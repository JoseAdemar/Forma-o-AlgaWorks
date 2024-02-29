import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        Carro seuCarro = new Carro();
        Pessoa propietario1 = new Pessoa();
        Pessoa propietario2 = new Pessoa();

        propietario1.nome = "Junior";
        propietario1.cpf = "012-125-84";
        propietario1.anoNascimento = 1990;

        propietario2.nome = "Thiago";
        propietario2.cpf = "312-125-86";
        propietario2.anoNascimento = 1980;

        System.out.println("Descrição do meu carro");
        meuCarro.fabricante = "BMW";
        meuCarro.modelo = "X1";
        meuCarro.cor = "Cinza";
        meuCarro.anoFabricacao = 2024;
        meuCarro.propietario = propietario1;
        System.out.printf("Fabricante: %s%n", meuCarro.fabricante);
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Cor: %s%n", meuCarro.cor);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Propietário: %s%n", meuCarro.propietario.nome);

        System.out.println();

        System.out.println("Descrição do seu carro");
        seuCarro.fabricante = "Toyota";
        seuCarro.modelo = "X5";
        seuCarro.cor = "Vermelho";
        seuCarro.anoFabricacao = 2023;
        seuCarro.propietario = propietario2;
        System.out.printf("Fabricante: %s%n", seuCarro.fabricante);
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Cor: %s%n", seuCarro.cor);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Propietário: %s%n", seuCarro.propietario.nome);

    }
}
