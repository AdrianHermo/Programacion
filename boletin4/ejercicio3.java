public class ejercicio3 {
    public static void main(String[] args) {
        Scanner introduccionD = new Scanner(System.in);

        System.out.print("Introduzca un valor numerico:");
        int numero = introduccionD.nextInt();

        int valorAbsoluto = (numero<=-1) ? -numero:numero;
        System.out.println("El valor absoluto del numero " + numero + " es " + valorAbsoluto);
    }
}