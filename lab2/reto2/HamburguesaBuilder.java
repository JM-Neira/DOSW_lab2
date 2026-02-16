import java.util.ArrayList;
import java.util.List;

public class HamburguesaBuilder {

    private String pan;
    private String carne;
    private List<String> ingredientes = new ArrayList<>();
    private List<Double> precios = new ArrayList<>();

    public HamburguesaBuilder conPan(String pan, double precio) {
        this.pan = pan;
        precios.add(precio);
        return this;
    }

    public HamburguesaBuilder conCarne(String carne, double precio) {
        this.carne = carne;
        precios.add(precio);
        return this;
    }

    public HamburguesaBuilder agregarIngrediente(String nombre, double precio) {
        ingredientes.add(nombre);
        precios.add(precio);
        return this;
    }

    public Hamburguesa build() {
        return new Hamburguesa(pan, carne, ingredientes, precios);
    }
}
