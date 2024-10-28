import java.util.Scanner;

/**
 * autor Adrian Hermo
 * Version 1.0
 **/
public class ejercicio3 {
    public static void main(String[] args) {
        // Declaramos la variable
        int valor;
        // Definimos el objeto Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un numero:");
        valor = entrada.nextInt();
        entrada.close();
        if (valor >= 0) {
            if (valor==0){
                System.out.println(0);
            }
            else {
                System.out.println('+');
            }
        }
        else  {
            System.out.println('-');
        }

    }
}