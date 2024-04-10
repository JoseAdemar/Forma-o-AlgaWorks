import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {
    public static void main(String[] args) {

        Path arquivo = Path.of("C:\\Users\\Acer\\Documents\\Formacao ALGAWORKS\\ESPECIALISTA-JAVA\\Projetos\\testandcriararquivocomjava\\teste.txt");

        BufferedReader reader = null;

        try {
            reader = Files.newBufferedReader(arquivo);
            System.out.println(reader.readLine());

            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                System.out.println("Erro fechando leitor de arquivo");
            }
        }
    }

}