//Clase Main con el metodo main para ejecutar el codigo
public  class Main {
    public static void main(String[] args) throws Exception {
        //Declaracion de un objeto Pedido platos con un array
        Pedido platos = new Pedido(3);

        //Declaramos tres objetos tipo Plato, Entrada, PlatoFuerte, Postre
        Plato plato1 = new Entrada("Quesadilla",5.99);
        Plato plato2 = new PlatoFuerte("Pasta",15.99);
        Plato plato3 = new Postre("Tiramisu",6.99);

        //Agregamos los platos al array
        platos.agregarPlato(plato1);
        platos.agregarPlato(plato2);
        platos.agregarPlato(plato3);

        //Imprimos los resultados por pantalla
        System.out.println("Precio de los platos: ");
        System.out.println("Entrada: ");
        System.out.println(Math.round(plato1.calcularPrecio()));
        System.out.println("Plato fuerte: ");
        System.out.println(Math.round(plato2.calcularPrecio()));
        System.out.println("Postre: ");
        System.out.println(Math.round(plato3.calcularPrecio()));

        System.out.println("Precio total del pedido: ");
        System.out.println(platos.calcularTotal());
    }
}