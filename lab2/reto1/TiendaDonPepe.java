import java.util.Scanner;

public class TiendaDonPepe {

    public static void run() {

        Scanner scanner = new Scanner(System.in);

        Producto camiseta = new Producto("Camiseta", 20000);
        Producto pantalon = new Producto("Pantalón", 50000);
        Producto galletas = new Producto("Galletas", 500);
        Producto jugo = new Producto("Jugo Natural", 3000);

        System.out.println("Bienvenido a la tienda Don Pepe!");
        System.out.println("Tipo de cliente:");
        System.out.println("1. Nuevo");
        System.out.println("2. Frecuente");

        int opcion = Integer.parseInt(scanner.nextLine());

        Cliente cliente = (opcion == 1)
                ? new Cliente("Nuevo", new DescuentoNuevo())
                : new Cliente("Frecuente", new DescuentoFrecuente());

        Carrito carrito = new Carrito();

        while (true) {
            System.out.println("\nSeleccione producto:");
            System.out.println("1. Camiseta");
            System.out.println("2. Pantalón");
            System.out.println("3. Galletas");
            System.out.println("4. Jugo Natural");
            System.out.println("5. Finalizar compra");

            int seleccion = Integer.parseInt(scanner.nextLine());

            if (seleccion == 5) break;

            System.out.print("Cantidad: ");
            int cantidad = Integer.parseInt(scanner.nextLine());

            switch (seleccion) {
                case 1 -> carrito.agregarProducto(camiseta, cantidad);
                case 2 -> carrito.agregarProducto(pantalon, cantidad);
                case 3 -> carrito.agregarProducto(galletas, cantidad);
                case 4 -> carrito.agregarProducto(jugo, cantidad);
            }
        }

        imprimirRecibo(cliente, carrito);
    }

    private static void imprimirRecibo(Cliente cliente, Carrito carrito) {

        System.out.println("\n--- RECIBO DE COMPRA ---");
        System.out.println("Cliente: " + cliente.getTipo());
        System.out.println("Productos:");

        carrito.getItems().forEach(item ->
                System.out.println("- " + item.getProducto().getNombre()
                        + " - $" + item.calcularTotal())
        );

        double subtotal = carrito.calcularSubtotal();
        double descuento = cliente.aplicarDescuento(subtotal);
        double total = subtotal - descuento;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + total);
        System.out.println("------------------------");
        System.out.println("¡Gracias por su compra!");
    }
}
