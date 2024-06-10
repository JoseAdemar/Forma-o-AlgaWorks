package aula10;

import java.io.*;

public class Principal {

    public static void main(String[] args) {
        String[] nomes = { "João", "Maria", "Sebastião", "José" };
        File arquivoDestino = new File("C:\\Users\\Acer\\Documents\\Formacao ALGAWORKS\\ESPECIALISTA-JAVA\\Projetos\\io-antiga-java\\src\\main\\java\\aula10\\doc\\lista.txt");

        try (Writer escritor = new FileWriter(arquivoDestino)) {
            for (String nome : nomes) {
                escritor.write(nome + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }

}