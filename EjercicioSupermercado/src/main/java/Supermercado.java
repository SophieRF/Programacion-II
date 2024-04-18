import java.util.ArrayList;
public class Supermercado {
    private Producto producto;
    private ArrayList<Producto> inventario;
    public static class Producto {
        private String nombre;
        private double precio;
        private int cantidadStock;

        public Producto(String nombre, double precio, int cantidadStock) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidadStock = cantidadStock;
        }
        public Producto(){
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getCantidadStock() {
            return cantidadStock;
        }

        public void setCantidadStock(int cantidadStock) {
            this.cantidadStock = cantidadStock;
        }

        public void verInformacion() {
            System.out.println("Nombre del producto: " + getNombre() + "\nPrecio: $" + getPrecio() + "\nStock disponible: " + getCantidadStock() + "\n*-*-*-._.-*-*-*");
        }
    }
    public Supermercado(Producto producto, ArrayList<Producto> inventario) {
        this.inventario = inventario;
        this.producto = producto;
    }
    public Supermercado(){
        this.inventario = new ArrayList<>();
    }
    public void agregarProducto(Producto producto){
        inventario.add(producto);
        System.out.println("Se agregó "+ producto.getNombre()+ " al inventario");
    }
    public void buscarProducto(String nombreProducto) {
        boolean encontrado = false;
        for (Producto producto : inventario) {
            if (producto.getNombre().equals(nombreProducto)) {
                System.out.println("Se encontró " + nombreProducto + " en el inventario. Su stock es de " + producto.getCantidadStock());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró " + nombreProducto + " en el inventario.");
        }
    }
    public void realizarCompra(Producto producto){
        producto.setCantidadStock(producto.cantidadStock -= 1);
    }
    public void mostrarInventario(){
        System.out.println("LISTA DE PRODUCTOS:");
        for (Producto producto: inventario){
            producto.verInformacion();
        }
    }

}
