package desafio;

import desafio.io.FragmentadorDeArquivo;

import java.io.File;
import java.io.IOException;

public class Principal1 {
    public static void main(String[] args) {
        try {
            var fragmentador = new FragmentadorDeArquivo(
                    new File("C:\\Users\\Acer\\Documents\\Formacao ALGAWORKS\\ESPECIALISTA-JAVA\\Projetos\\io-antiga-java\\src\\main\\java\\desafio\\arquivos\\fotos\\img.png"),
                    1024 * 50);
            fragmentador.fragmentar();
        } catch (IOException e) {
            System.out.println("Erro fragmentando arquivo");
            e.printStackTrace();
        }
    }

}
