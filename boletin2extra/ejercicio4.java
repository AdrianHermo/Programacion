import java.util.Scanner;
/**
 * nos dice cuantos billetes tenemos de cada tipo
 * autor Adrian Hermo
 * version 1.0
 * **/
public class ejercicio4 {
    public static void main(String[] args) {
        int B100, B50, B20, B10, B5;
        Scanner cant = new Scanner(System.in);
        System.out.print("Indique la cantidad total de dinero:");
        int cantDinero = cant.nextInt();
        B100 = cantDinero/100;
        B50 = (cantDinero%100);
        B20 =(B50%50);
        B10 = (B20%20);
        B5 = (B10%10);
        System.out.println("Hay" + B100 + " billetes de 100€");
        System.out.println("Hay" + B50/50 + " billetes de 50€");
        System.out.println("Hay" + B20/20 + " billetes de 20€");
        System.out.println("Hay" + B10/10 + " billetes de 10€");
        System.out.println("Hay" + B5/5 + " billetes de 5€");
        System.out.println("Hay" + B5%5 + " monedas de 1€");
        cant.close();
    }
}