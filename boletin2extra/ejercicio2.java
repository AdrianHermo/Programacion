import java.util.Scanner;
/**
 * Pasar celsius a Kelvin y Fahrenheit
 * autor Adrian Hermo
 * version 1.0
 * **/
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner temper = new Scanner(System.in);
        System.out.print("Introduzca temperatura en Celsius:");
        double tempCelsius = temper.nextDouble();
        System.out.println("La temperatura de " + tempCelsius + "ºC es en Kelvin " + (tempCelsius+273.15) + "ºK");
        System.out.println("La temperatura de " + tempCelsius + "ºC es en Fahrenheit " + ((tempCelsius * 9 / 5) + 32) + "ºF");
    }
}