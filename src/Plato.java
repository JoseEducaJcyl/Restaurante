//Clase abstracta Plato con dos atributos:
//(String) nombre y (double) precioBase
public abstract class Plato {
    private String nombre;
    private double precioBase;

    //Constructor
    public Plato(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    //Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    //Metodo abstracto sin definir calcularPrecio
    public abstract double calcularPrecio();
}
