import java.util.Scanner;

/**
 * Descuentos
 * autor Adrian Hermo
 * version 1.0
 * **/
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.print("Introduzca precio total del producto:");
        double precio = datos.nextDouble();
        System.out.print("Introduzca el precio del descuento:");
        double precioDescuento = datos.nextDouble();
        if (precio< precioDescuento) {
            System.out.println("estudia algo mas");
        }
        else {
            System.out.println("El descuento es de " + (precioDescuento /precio)*100 + "%");
        }

    }
}