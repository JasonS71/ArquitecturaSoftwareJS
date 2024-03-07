package arqsoftware_ejercicio1;

//import java.awt.*;
//import java.sql.*;

public class Conexion {

//    static Connection conexion = null;
//    static String driver = "org.gjt.mm.mysql.Driver";
//    static String url = "jdbc:mysql://localhost/com350_practica1";
//
//    public Connection conectar() {
//
//        try {
//            if (conexion == null) {
//                Class.forName(driver);
//                conexion = DriverManager.getConnection(url, "root", "");
//                System.out.println("Conexion Correcta!!");
//            }
//        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
//            System.out.println(e);
//        }
//
//        return conexion;
//    }
//
//    public void cerrarConexion() {
//        try {
//            if (conexion != null) {
//                conexion.close();
//                System.out.println("Conexion cerrada!!");
//            }
//        } catch (SQLException e) {
//            System.out.println("Error al cerrar la conexión: " + e.getMessage());
//        }
//    }
//
//    public void insertarCoche(Coche coche) {
//        String sql = "INSERT INTO coche (Marca, Modelo, Placa, Color, Cilindrada) VALUES (?, ?, ?, ?, ?)";
//        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
//            preparedStatement.setString(1, coche.getMarca().toString());
//            preparedStatement.setString(2, coche.getModelo());
//            preparedStatement.setString(3, coche.getPlaca());
//            preparedStatement.setString(4, coche.getColor());
//            preparedStatement.setString(5, coche.getCilindrada());
//            preparedStatement.executeUpdate();
//            System.out.println("Coche insertado en la base de datos.");
//        } catch (SQLException e) {
//            System.out.println("Error al insertar el coche: " + e.getMessage());
//        }
//    }
}