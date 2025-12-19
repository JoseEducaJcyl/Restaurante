//Clase PlatoFuerte que se entiende de Plato
public class PlatoFuerte extends Plato {
    //Atributo constante IVA
    final double IVA = 1.25;

    //Constructor que hereda de la clase Plato
    public PlatoFuerte(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    //Metodo definido calcularPrecio
    @Override
    public double calcularPrecio() throws PrecioIncorrectoException {
        if (getPrecioBase() < 0) {
            throw new PrecioIncorrectoException("Precio incorrecto");
        }
        return getPrecioBase() * IVA;
    }
}
