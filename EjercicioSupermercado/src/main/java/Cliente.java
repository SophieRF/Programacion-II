import java.util.ArrayList;
public class Cliente {
    private String nombre;
    private String apellido;
    private Carrito carrito;
    public class Carrito{
        private ArrayList<Supermercado.Producto> productos;

        public Carrito() {
            this.productos = new ArrayList<>();
        }

        public Carrito(ArrayList<Supermercado.Producto> productos) {
            this.productos = productos;
        }

        public ArrayList<Supermercado.Producto> getProductos() {
            return productos;
        }
        public void setProductos(ArrayList<Supermercado.Producto> productos) {
            this.productos = productos;
        }
    }

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrito = new Carrito();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void agregarAlcarrito(Supermercado.Producto producto){
        carrito.getProductos().add(producto);
    }
    public void calcularTotalDeCompra(){
        double sumatoria = 0;
        for (Supermercado.Producto producto : carrito.productos){
            sumatoria += producto.getPrecio();
        }
        System.out.println("El costo total de la compra es de $"+ sumatoria);
    }
}
