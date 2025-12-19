//Clase Entrada que se entiende de Plato
public class Entrada extends Plato {
    //Atributo constante IVA
    final double IVA = 1.25;

    //Constructor que hereda de la clase Plato
    public Entrada(String nombre, double precioBase) {
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
