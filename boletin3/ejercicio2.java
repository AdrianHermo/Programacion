import java.util.Scanner;
/**
 *
 * autor Adrian Hermo
 * Version 1.0
 **/
public class ejercicio2 {
    public static void main(String[] args) {
        //Inicializamos variables para almacenar numeros
        short valor1;
        short valor2;
        Scanner entrada = new Scanner(System.in); //Definimos instancia de la clase Scanner
        System.out.print("Introduzca un primer valor:"); //Indicamos que queremos que se introduzca un numero
        valor1 = entrada.nextShort(); // Se deja espacio para introducir la entrada y se guarda esto en una variable
        System.out.print("Introduzca un segundo valor:"); //Indicamos que queremos que se introduzca un segundo valor
        valor2 = entrada.nextShort(); // Se deja espacio para introducir la entrada y se guarda esto en una variable
        entrada.close(); //Cerramos el flujo de datos proveniente de la clase Scanner
        if (valor1>=valor2) { //Usamos un condicional para verficar si el valor 1 es mayor al valor2
            System.out.println("El resultado es una resta que es igual " + (valor1-valor2));
        }
        else {
            System.out.println("El resultado es una suma que es igual a " + (valor1+valor2));
        }

    }
}