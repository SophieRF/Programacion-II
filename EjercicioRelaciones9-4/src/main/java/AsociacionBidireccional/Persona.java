package AsociacionBidireccional;
import java.util.ArrayList;
import java.util.List;
public class Persona {
    private String nombre;
    private ArrayList<Libro> libros = new ArrayList<Libro>() {};

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List getLibros() {
        return libros;
    }
    public void setLibros(ArrayList libros) {
        this.libros = libros;
    }
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    public void mostrarLibros(){
        System.out.println("Libros de "+getNombre()+":");
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo());
        }
    }
}
