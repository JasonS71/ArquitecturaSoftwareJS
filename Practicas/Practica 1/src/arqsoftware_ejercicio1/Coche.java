package arqsoftware_ejercicio1;

import java.awt.*;
import java.sql.*;

public class Coche {
    Marca marca;
    String modelo;
    String placa;
    String color;
    String cilindrada;

    
    static Connection conexion = null;
    static String driver = "org.gjt.mm.mysql.Driver";
    static String url = "jdbc:mysql://localhost/com350_practica1";
    
    public Coche(Marca marca, String modelo, String placa, String color, String cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    private void conectar() {
        try {
            if (conexion == null) {
                Class.forName(driver);
                conexion = DriverManager.getConnection(url, "root", "");
                System.out.println("Conexion Correcta!!");
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    private void cerrarConexion() {
        try {
            if (conexion != null) {
                conexion.close();
                System.out.println("Conexion cerrada!!");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

    public void insertarCoche() {
        conectar();
        String sql = "INSERT INTO coche (Marca, Modelo, Placa, Color, Cilindrada) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setString(1, this.marca.toString());
            preparedStatement.setString(2, this.modelo);
            preparedStatement.setString(3, this.placa);
            preparedStatement.setString(4, this.color);
            preparedStatement.setString(5, this.cilindrada);
            preparedStatement.executeUpdate();
            System.out.println("Coche insertado en la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al insertar el coche: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }
    
    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", color=" + color + ", cilindrada=" + cilindrada + '}';
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    
}
