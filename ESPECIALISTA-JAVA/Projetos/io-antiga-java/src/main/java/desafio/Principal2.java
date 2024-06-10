package desafio;

import desafio.io.UnificadorDeArquivos;

import java.io.File;
import java.io.IOException;

public class Principal2 {

    public static void main(String[] args) {
        try {
            var unificador = new UnificadorDeArquivos(
                    new File("C:\\Users\\Acer\\Documents\\Formacao ALGAWORKS\\ESPECIALISTA-JAVA\\Projetos\\io-antiga-java\\src\\main\\java\\desafio\\arquivos\\fotos"),
                    new File("C:\\Users\\Acer\\Documents\\Formacao ALGAWORKS\\ESPECIALISTA-JAVA\\Projetos\\io-antiga-java\\src\\main\\java\\desafio\\arquivos\\fotos\\img.png"),
                    "img.png");
            unificador.unificar();
        } catch (IOException e) {
            System.out.println("Erro ao unificar arquivos");
            e.printStackTrace();
        }
    }

}
