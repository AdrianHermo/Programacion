import java.util.Scanner;
/**
 * transformar de millas nauticas a metros
 * autor Adrian Hermo
 * version 1.0
 * **/
public class Ejercicio5 {
    public static void main(String[] args) {
        //Creamos objeto millaNauticas para recibir datos
        Scanner millaNauticas = new Scanner(System.in);
        System.out.print("Indiqueme un valor en millas nauticas:");
        int cantMillaN = millaNauticas.nextInt();
        //Cerramos el flujo del objeto millaNauticas
        millaNauticas.close();
        final int MILLASN_METROS = 1852;
        System.out.println("La cantidad de " + cantMillaN + " milla nauticas equivale a " + cantMillaN* MILLASN_METROS + " metros");
    }
}