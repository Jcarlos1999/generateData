package jcarlos.IAemFisio;

import java.sql.*;
public class JDBC {
    public static void main(String[] args) throws SQLException {

        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", ""))
        {
            String query = "SELECT * FROM paciente";
            PreparedStatement preparedStatement = conn.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                System.out.println(resultSet.getString("idPaciente"));
                System.out.println(resultSet.getString("primeiroNome"));
                System.out.println(resultSet.getString("sobrenome"));
            }

        }
    }




}
