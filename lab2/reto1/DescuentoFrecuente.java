public class DescuentoFrecuente implements DescuentoStrategy {

    @Override
    public double aplicarDescuento(double subtotal) {
        return subtotal * 0.10;
    }
}
