import java.util.List;

public class Hamburguesa {

    private final String pan;
    private final String carne;
    private final List<String> ingredientes;
    private final List<Double> precios;

    public Hamburguesa(String pan, String carne,
                       List<String> ingredientes,
                       List<Double> precios) {
        this.pan = pan;
        this.carne = carne;
        this.ingredientes = ingredientes;
        this.precios = precios;
    }

    public double calcularPrecioTotal() {
        return precios.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
    }

    public void mostrarDetalle() {
        System.out.println("\n--- HAMBURGUESA PERSONALIZADA ---");
        System.out.println("Pan: " + pan);
        System.out.println("Carne: " + carne);

        if (!ingredientes.isEmpty()) {
            System.out.println("Ingredientes adicionales:");
            ingredientes.forEach(i -> System.out.println("- " + i));
        }

        System.out.println("Precio total: $" + calcularPrecioTotal());
        System.out.println("----------------------------------");
    }
}
