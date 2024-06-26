package aula09;

import java.io.*;

public class Principal {

    public static void main(String[] args) {
        File arquivoOrigem = new File("C:\\Users\\Acer\\Documents\\Formacao ALGAWORKS\\ESPECIALISTA-JAVA\\Projetos\\io-antiga-java\\src\\main\\java\\aula09\\doc\\contrato.txt");
        StringBuilder texto = new StringBuilder();

        try (Reader leitor = new FileReader(arquivoOrigem)) {
            char[] conteudo = new char[1000];
            int quantidadeCaracteres;

            while ((quantidadeCaracteres = leitor.read(conteudo)) > 0) {
                texto.append(conteudo, 0, quantidadeCaracteres);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }

        System.out.println(texto);
    }

}