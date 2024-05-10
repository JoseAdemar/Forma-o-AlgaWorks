import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonScraper {

    public static void main(String[] args) {

        String json = """
                [
                    {
                       "id": 1, 
                       "nome": "João da Silva",
                    },
                                
                    {
                       "id": 2,
                       "nome": "Maria Abadia"
                    },
                    {
                       "id": 3,
                       "nome": "Sebastião Carvalho"
                    }
                ]
                """;


        Pattern pattern = Pattern.compile("\":(?<nome>\\s*\"([^\"]*)\")");
        Matcher matcher = pattern.matcher(json);


        while (matcher.find()) {
            System.out.println(matcher.group("nome"));
        }

        System.out.println("------------------------------");
        System.out.println(json);
    }
}
