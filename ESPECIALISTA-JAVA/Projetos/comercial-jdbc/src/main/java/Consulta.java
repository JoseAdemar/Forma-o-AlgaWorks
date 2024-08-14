import java.math.BigDecimal;
import java.sql.*;
import java.util.Scanner;

public class Consulta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisa por nome:");
        String pesquisaNome = scanner.nextLine();
        String url = "jdbc:mysql://localhost:3306/comercial";
        String user = "root";
        String password = "123";

        try (Connection conexao = DriverManager.getConnection(url, user, password);
             PreparedStatement comando = conexao
                     .prepareStatement("select  * from venda where nome_cliente like ?")) {

            comando.setString(1, "%" + pesquisaNome + "%");
            ResultSet resultado = comando.executeQuery();

            while (resultado.next()) {
                Long id = resultado.getLong("id");
                String nome = resultado.getString("nome_cliente");
                BigDecimal valorTotal = resultado.getBigDecimal("valor_total");
                Date data = resultado.getDate("data_pagamento");
                System.out.printf("%d - %s - R$%.2f - %s%n", id, nome, valorTotal, data);
            }

        } catch (SQLException e) {
            System.out.println("Erro de banco de dados");
            e.printStackTrace();
        }
    }
}
