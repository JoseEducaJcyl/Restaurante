public class Pedido {
    private Plato[] platos;
    private int contador;

    public Pedido(int capacidad) {
        platos = new Plato[capacidad];
        contador = 0;
    }

    public void agregarPlato(Plato plato) throws Exception {
        if (contador >= platos.length) {
            throw new Exception("No se pueden agregar más platos.");
        }
        platos[contador] = plato;
        contador++;
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += platos[i].calcularPrecio();
        }
        return Math.round(total);
    }

    public double calcularTotal(double propina) {
        return calcularTotal() + propina;
    }
}
