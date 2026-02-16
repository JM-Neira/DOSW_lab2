public class Cliente {

    private final String tipo;
    private final DescuentoStrategy descuentoStrategy;

    public Cliente(String tipo, DescuentoStrategy descuentoStrategy) {
        this.tipo = tipo;
        this.descuentoStrategy = descuentoStrategy;
    }

    public double aplicarDescuento(double subtotal) {
        return descuentoStrategy.aplicarDescuento(subtotal);
    }

    public String getTipo() {
        return tipo;
    }
}
