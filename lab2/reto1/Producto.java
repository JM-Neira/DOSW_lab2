public class Producto {
    private final String nombre;
    private final double precioUnitario;
    public Producto(String nombre, double precioUnitario) {
        if (precioUnitario < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    @Override
    public String toString() {
        return nombre + " - $" + String.format("%,.0f", precioUnitario);
    }
}

