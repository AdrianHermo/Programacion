ublic class ejercicio1 {
    public static void main(String[] args) {
        int numeroVentas;
        String nombreProducto;

        Scanner informacion = new Scanner(System.in);

        System.out.print("Digame el nombre del producto:");

        nombreProducto = informacion.next();

        System.out.print("Digame cuantas ventas ha tenido el producto:");

        numeroVentas = informacion.nextInt();

        if (numeroVentas<=100) {
            System.out.println("El producto " + nombreProducto + " ha tenido " + numeroVentas + " ventas" + " es un articulo de consumo bajo");
        }

        else if (numeroVentas<=500) {
            System.out.println("El producto " + nombreProducto + " ha tenido " + numeroVentas + " ventas" + " es un articulo de consumo medio");
        }

        else if (numeroVentas<=1000) {
            System.out.println("El producto " + nombreProducto + " ha tenido " + numeroVentas + " ventas" + " es un articulo de consumo alto");
        }

        else {
            System.out.println("El producto " + nombreProducto + " ha tenido " + numeroVentas + " ventas" + " es un articulo de primera necesidad");
        }

    }
}