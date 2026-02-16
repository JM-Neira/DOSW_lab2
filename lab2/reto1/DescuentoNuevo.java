public class DescuentoNuevo implements DescuentoStrategy {

    @Override
    public double aplicarDescuento(double subtotal) {
        return subtotal * 0.05;
    }
}