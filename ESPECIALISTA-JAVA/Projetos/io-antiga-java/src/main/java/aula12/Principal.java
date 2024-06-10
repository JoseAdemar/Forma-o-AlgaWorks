package aula12;

import java.io.*;

public class Principal {

    public static void main(String[] args) {
        File arquivoOrigem = new File("C:\\Users\\Acer\\Documents\\Formacao ALGAWORKS\\ESPECIALISTA-JAVA\\Projetos\\io-antiga-java\\src\\main\\java\\aula12\\doc\\lista.txt");
        File arquivoDestino = new File("C:\\Users\\Acer\\Documents\\Formacao ALGAWORKS\\ESPECIALISTA-JAVA\\Projetos\\io-antiga-java\\src\\main\\java\\aula12\\doc\\saida.txt");

        try (Reader leitor = new FileReader(arquivoOrigem);
             Writer escritor = new BufferedWriter(new FileWriter(arquivoDestino))) {

            int conteudo;
            while ((conteudo = leitor.read()) != -1) {
                escritor.write(conteudo);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }

}