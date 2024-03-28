package org.CCristian.Java.JDBC;

import org.CCristian.Java.JDBC.Util.Conexion_BaseDeDatos_SINGLETON;

import java.sql.*;

public class Ejemplo_JDBC {
    public static void main(String[] args) {

        try (Connection connection = Conexion_BaseDeDatos_SINGLETON.getInstance();
        /*Conectarse a la base de datos*/
             Statement statement = connection.createStatement();
        /*Poder ejecutar acciones en la base de datos*/
             ResultSet resultSet = statement.executeQuery("SELECT * FROM productos")
        /*Obtiene de la Base de Datos la planilla 'productos'*/)
        {
            System.out.println("----------------------------------------------");
            System.out.println("id\t|\tnombre\t|\tprecio\t|\tfecha_registro");
            System.out.println("----------------------------------------------");
            while (resultSet.next()){
                System.out.print(resultSet.getInt("id") + "\t|\t");
                System.out.print(resultSet.getString("nombre") + "\t|\t");
                System.out.print(resultSet.getInt("precio") + "\t|\t");
                System.out.println(resultSet.getString("fecha_registro"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
