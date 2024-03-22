package org.CCristian.Java.JDBC;

import java.sql.*;

public class Ejemplo_JDBC {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=America/Argentina/Buenos_Aires";
        String user_name = "root";
        String password = "sasa";

        try {
            Connection connection = DriverManager.getConnection(url, user_name, password);
            /*Conectarse a la base de datos*/
            Statement statement = connection.createStatement();
            /*Poder ejecutar acciones en la base de datos*/
            ResultSet resultSet = statement.executeQuery("SELECT * FROM productos");
            /*Obtiene la Base de Datos*/

            while (resultSet.next()){
                System.out.println(resultSet.getString("nombre"));
            }
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
