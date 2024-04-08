import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {
    public static void main(String[] args) {

        Path arquivo = Path.of("C:\\Users\\Acer\\Documents\\Formacao ALGAWORKS\\ESPECIALISTA-JAVA\\Projetos\\testandcriararquivocomjava\\teste.txt");

        try {
            Files.createFile(arquivo);
        } catch (IOException e) {
            System.out.println("Error ao criar o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
