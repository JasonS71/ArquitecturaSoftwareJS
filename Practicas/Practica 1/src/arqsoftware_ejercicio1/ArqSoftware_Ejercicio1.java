package arqsoftware_ejercicio1;
import java.util.Scanner;

public class ArqSoftware_Ejercicio1 {

    public static void main(String[] args) {
        //Conexion con = new Conexion();
        //con.conectar();
        
        Marca marca=Marca.Ford;
        String modelo;
        String placa;
        String color;
        String cilindrada;
        
        String recibido;
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Introduzca la marca del coche:");
        System.out.println("1. Toyota");
        System.out.println("2. Nissan");
        System.out.println("3. Ford");
        System.out.println("4. Mitsubishi");
        recibido = miScanner.nextLine();
        switch (recibido) {
            case "1" -> marca = Marca.Toyota;
            case "2" -> marca = Marca.Nissan;
            case "3" -> marca = Marca.Ford;
            case "4" -> marca = Marca.Mitsubishi;
            default -> System.out.println("Valor incorrecto");
        }
        System.out.println("Introduzca la modelo del coche:");
        modelo = miScanner.nextLine();
        System.out.println("Introduzca la placa del coche:");
        placa = miScanner.nextLine();
        System.out.println("Introduzca la color del coche:");
        color = miScanner.nextLine();
        System.out.println("Introduzca la cilindrada del coche:");
        cilindrada = miScanner.nextLine();
        
        Coche miCoche = new Coche(marca, modelo, placa, color, cilindrada);
        
        miCoche.insertarCoche();
        
    }
    
}
