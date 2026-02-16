import java.util.Scanner;

public class ChefCincoEstrellas {

    public static void run() {

        Scanner scanner = new Scanner(System.in);

        HamburguesaBuilder builder = new HamburguesaBuilder();

        System.out.println("Seleccione tipo de pan:");
        System.out.println("1. Tradicional ($2000)");
        System.out.println("2. Integral ($2500)");
        int pan = Integer.parseInt(scanner.nextLine());

        if (pan == 1)
            builder.conPan("Tradicional", 2000);
        else
            builder.conPan("Integral", 2500);

        System.out.println("Seleccione tipo de carne:");
        System.out.println("1. Res ($8000)");
        System.out.println("2. Pollo ($7000)");
        int carne = Integer.parseInt(scanner.nextLine());

        if (carne == 1)
            builder.conCarne("Res", 8000);
        else
            builder.conCarne("Pollo", 7000);

        while (true) {
            System.out.println("\nAgregar ingrediente adicional:");
            System.out.println("1. Queso ($1500)");
            System.out.println("2. Lechuga ($500)");
            System.out.println("3. Salsa especial ($1000)");
            System.out.println("4. Finalizar");

            int opcion = Integer.parseInt(scanner.nextLine());

            if (opcion == 4) break;

            switch (opcion) {
                case 1 -> builder.agregarIngrediente("Queso", 1500);
                case 2 -> builder.agregarIngrediente("Lechuga", 500);
                case 3 -> builder.agregarIngrediente("Salsa especial", 1000);
            }
        }

        Hamburguesa hamburguesa = builder.build();
        hamburguesa.mostrarDetalle();
    }
}
