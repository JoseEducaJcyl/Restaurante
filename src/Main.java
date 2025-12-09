public  class Main {
    public static void main(String[] args) throws Exception {
        Pedido platos = new Pedido(3);

        Plato plato1 = new Entrada("Quesadilla",5.99);
        Plato plato2 = new PlatoFuerte("Pasta",15.99);
        Plato plato3 = new Postre("Tiramisu",6.99);

        platos.agregarPlato(plato1);
        platos.agregarPlato(plato2);
        platos.agregarPlato(plato3);

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