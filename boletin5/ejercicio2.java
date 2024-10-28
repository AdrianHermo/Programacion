public class ejercicio2 {
    public static void main(String[] args) {
        int suma = 0;  // Variable para almacenar a suma dos números
        long produto = 1;  // Variable para almacenar o produto dos números

        // Bucle para calcular a suma e o produto dos números entre 10 e 90
        for (int i = 10; i <= 90; i++) {
            suma += i;  // Sumar o valor actual
            produto *= i;  // Multiplicar o valor actual
        }

        // Amosa o resultado
        System.out.println("A suma dos números entre 10 e 90 é: " + suma);
        System.out.println("O produto dos números entre 10 e 90 é: " + produto);
    }
}