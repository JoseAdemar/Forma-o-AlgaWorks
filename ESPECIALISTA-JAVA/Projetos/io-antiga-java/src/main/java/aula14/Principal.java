package aula14;

import java.io.*;
import java.util.Scanner;

public class Principal {


    public static void main(String[] args) throws IOException {
        String nome = "José Junior";
//        OutputStream out = System.out;
//        out.write("Thiago".getBytes());

//        PrintStream out = System.out;
        PrintStream out = new PrintStream(
                new FileOutputStream(new File("C:\\Users\\Acer\\Documents\\Formacao ALGAWORKS\\ESPECIALISTA-JAVA\\Projetos\\io-antiga-java\\src\\main\\java\\aula14\\doc\\arquivo.txt")));
        out.printf("Olá, %s %n", nome);
    }

}