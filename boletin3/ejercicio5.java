public class ejercicio5 {
    /**
     *
     * autor Adrian Hermo
     **/
    public static void main(String[] args) {
        int valor1 = 23;
        int valor2 = 4;
        int valor3 = 32;
        if (valor1>valor2 && valor1>valor3) {
            System.out.println("El valor mayor es " + valor1);
        }
        else if (valor2>valor3) {
            System.out.println("El valor mayor es " + valor2);
        }
        else {
            System.out.println("El valor mayor es " + valor3);
        }
    }
}