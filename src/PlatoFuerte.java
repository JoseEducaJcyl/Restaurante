public class PlatoFuerte extends Plato {
    final double IVA = 1.25;
    public PlatoFuerte(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularPrecio() throws PrecioIncorrectoException {
        if (getPrecioBase() < 0) {
            throw new PrecioIncorrectoException("Precio incorrecto");
        }
        return getPrecioBase() * IVA;
    }
}
