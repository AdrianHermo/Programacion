import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];  // Array para almacenar os 10 números
        int positivos = 0, negativos = 0, ceros = 0;

        // Entrar os 10 números
        System.out.println("Introduce 10 números enteiros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextInt();  // Le o número desde o usuario

            // Contar os positivos, negativos e ceros
            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        // Mostrar os resultados
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

        sc.close();
    }
}