public class Postre extends Plato{
    final double IVA = 1.25;
    public Postre(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularPrecio() throws PrecioIncorrectoException {
        return getPrecioBase() * IVA;
    }
    public double calcularPrecio(double descuento) throws PrecioIncorrectoException {
        return (getPrecioBase() * IVA) - descuento;
    }
}
