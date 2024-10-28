public class ejercicio4 {
    public static void main(String[] args) {
        String resultadoD;
        String resultadoU;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un valor entre 0 e 99:");
        // Indicamos el valor a introducir
        int valor = input.nextInt();
        if (valor >= 10 && valor <= 20) {
            switch (valor) {
                case 10 -> System.out.println("Diez");
                case 11 -> System.out.println("Once");
                case 12 -> System.out.println("Doce");
                case 13 -> System.out.println("Trece");
                case 14 -> System.out.println("Catorce");
                case 15 -> System.out.println("Quince");
                case 16 -> System.out.println("Dieciseis");
                case 17 -> System.out.println("Diecisiete");
                case 18 -> System.out.println("Dieciocho");
                case 19 -> System.out.println("Diecinueve");
                case 20 -> System.out.println("Veinte");
            }
        }

        else {

            int decenas = valor / 10;
            int unidades = valor % 10;

            resultadoD = switch (decenas) {
                case 2 -> "Veinti";
                case 3 -> "Treinta";
                case 4 -> "Cuarenta";
                case 5 -> "Cincuenta";
                case 6 -> "Sesenta";
                case 7 -> "Setenta";
                case 8 -> "Ochenta";
                case 9 -> "Noventa";
                default -> "";
            };

            resultadoU = switch (unidades) {
                case 0 -> "cero";
                case 1 -> "uno";
                case 2 -> "dos";
                case 3 -> "tres";
                case 4 -> "cuatro";
                case 5 -> "cinco";
                case 6 -> "seis";
                case 7 -> "siete";
                case 8 -> "ocho";
                case 9 -> "nueve";
                default -> "";
            };

            if ((valor <= 99) && !(valor < 0)) {
                if (unidades == 0 && decenas != 0) {
                    System.out.println(resultadoD);
                }

                else if (valor >= 20 && valor <= 29) {
                    System.out.println(resultadoD + resultadoU);
                }

                else if (valor < 10) {
                    System.out.println(resultadoU);
                }
                else {
                    System.out.println(resultadoD + " y " + resultadoU);
                }
            }

            else {
                System.out.println("Has introducido un valor no valido");
            }
        }

        input.close();
    }
}