public class Main {
    public static void main(String[] args) {
        Supermercado super1 = new Supermercado();
        Supermercado.Producto producto1 = new Supermercado.Producto("Arroz", 1200, 300);
        Supermercado.Producto producto2 = new Supermercado.Producto("Yerba", 1000, 200);
        Supermercado.Producto producto3 = new Supermercado.Producto("Aceite",1100, 260);
        Supermercado.Producto producto4 = new Supermercado.Producto("Galletas", 900, 280);
        Cliente cliente1 = new Cliente("Juan", "Perez");
        super1.agregarProducto(producto1);
        super1.agregarProducto(producto2);
        super1.agregarProducto(producto3);
        super1.agregarProducto(producto4);
        super1.buscarProducto("Aceite");
        super1.mostrarInventario();
        cliente1.agregarAlcarrito(producto1);
        cliente1.agregarAlcarrito(producto2);
        cliente1.calcularTotalDeCompra();
        super1.realizarCompra(producto1);
        super1.realizarCompra(producto2);
        super1.mostrarInventario();
    }
}
