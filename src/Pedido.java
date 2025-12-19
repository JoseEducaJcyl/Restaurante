//Clase Pedido con los atributos
//(array de Plato) platos y (int) contador
public class Pedido {
    private Plato[] platos;
    private int contador;

    //Contructor que inicializa el contador a cero
    public Pedido(int capacidad) {
        platos = new Plato[capacidad];
        contador = 0;
    }

    //Metodo para agregar platos al array, cada plato que se agregue
    //aumenta el contador
    public void agregarPlato(Plato plato) throws Exception {
        if (contador >= platos.length) {
            throw new Exception("No se pueden agregar más platos.");
        }
        platos[contador] = plato;
        contador++;
    }

    //Metodo que recoore el array y suma el valor de cada plato
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += platos[i].calcularPrecio();
        }
        return Math.round(total);
    }

    //Metodo que recoore el array y suma el valor de cada plato y agrega propina
    public double calcularTotal(double propina) {
        return calcularTotal() + propina;
    }
}
