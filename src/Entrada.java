public class Entrada extends Plato {
    final double IVA = 1.25;
    public Entrada(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularPrecio() throws PrecioIncorrectoException {
        return getPrecioBase() * IVA;
    }
}
