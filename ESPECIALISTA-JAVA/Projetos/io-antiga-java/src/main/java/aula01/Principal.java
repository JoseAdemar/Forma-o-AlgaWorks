package aula01;

import java.io.File;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {
//        File pasta1 = new File("C:\\temp\\docs");
        File pasta1 = new File("C:\\Users\\Acer\\Documents\\Formacao ALGAWORKS\\" +
                "ESPECIALISTA-JAVA\\Projetos\\io-antiga-java\\docs");
        System.out.printf("Pasta 1 criada: %b%n", pasta1.mkdir());

        File pasta2 = new File("C:\\Users\\Acer\\Documents\\Formacao ALGAWORKS\\" +
                "ESPECIALISTA-JAVA\\Projetos\\io-antiga-java\\fotos\\viagens");
        System.out.printf("Pasta 2 criada: %b%n", pasta2.mkdirs());

        /*File arquivo1 = new File("C:\\Users\\Acer\\Documents\\Formacao ALGAWORKS\\" +
                "ESPECIALISTA-JAVA\\Projetos\\io-antiga-java\\docs\\contrato.txt");*/

        File arquivo2 = new File(pasta1, "contrato.txt");

        System.out.printf("Arquivo 2 criado: %b%n", arquivo2.createNewFile());
    }

}
