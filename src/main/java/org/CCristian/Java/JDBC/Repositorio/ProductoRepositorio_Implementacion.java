package org.CCristian.Java.JDBC.Repositorio;

import org.CCristian.Java.JDBC.Models.Producto;
import org.CCristian.Java.JDBC.Util.Conexion_BaseDeDatos_SINGLETON;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorio_Implementacion implements Repositorio<Producto> {

/*------------------MÉTODOS------------------*/
    public Connection getConnection() throws SQLException {
        return Conexion_BaseDeDatos_SINGLETON.getInstance();
    }

    @Override
    public List<Producto> listar() {
        List<Producto> productos = new ArrayList<>();

        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM productos"))
        {
            while (resultSet.next()){
                Producto producto = crearProducto(resultSet);
                productos.add(producto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productos;
    }

    @Override
    public Producto buscarPorId(Long id) {
        Producto producto = null;
        try(PreparedStatement preparedSt = getConnection().
                prepareStatement("SELECT * FROM productos WHERE id = ?")
        ) {
            preparedSt.setLong(1, id);
            try (ResultSet resultSet = preparedSt.executeQuery()) {
                if (resultSet.next()) {
                    producto = crearProducto(resultSet);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producto;
    }

    @Override
    public void guardar(Producto producto) {
        String sql;  /*Plantilla*/
        if (producto.getId() != null && producto.getId()>0) {
            sql = "UPDATE productos SET nombre=?, precio=? WHERE id=?";
        } else {
            sql = "INSERT INTO productos(nombre, precio, fecha_registro) VALUES(?,?,?)";
        }
        try (PreparedStatement preparedSt = getConnection().prepareStatement(sql)){
            preparedSt.setString(1, producto.getNombre());
            preparedSt.setLong(2, producto.getPrecio());

            if (producto.getId() != null && producto.getId() > 0) { /*UPDATE*/
                preparedSt.setLong(3, producto.getId());
            } else {    /*INSERT*/
                preparedSt.setDate(3, new Date(producto.getFecha_registro().getTime()));
            }
            preparedSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void eliminar(Long id) {
        try (PreparedStatement preparedSt = getConnection().prepareStatement("DELETE FROM productos WHERE id=?")){
            preparedSt.setLong(1, id);
        } catch (SQLException e) {
            e.printStackTrace();        }
    }

    private static Producto crearProducto(ResultSet resultSet) throws SQLException {
        Producto producto = new Producto();
        producto.setId(resultSet.getLong("id"));
        producto.setNombre(resultSet.getString("nombre"));
        producto.setPrecio(resultSet.getInt("precio"));
        producto.setFecha_registro(resultSet.getDate("fecha_registro"));
        return producto;
    }
}
