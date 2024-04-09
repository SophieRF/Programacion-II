package AsociacionBidireccional;
public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Harry Potter y el caliz de fuego");
        Libro libro2 = new Libro("Harry Potter y la orden del fenix");
        Libro libro3 = new Libro("Harry Potter y el príncipe mestizo");

        Persona persona1 = new Persona("Pablo");
        Persona persona2 = new Persona("Julieta");
        Persona persona3 = new Persona("Camila");

        persona1.agregarLibro(libro3);
        persona2.agregarLibro(libro1);
        persona3.agregarLibro(libro2);
        persona3.agregarLibro(libro1);

        libro1.agregarPropietario(persona2);
        libro1.agregarPropietario(persona3);
        libro2.agregarPropietario(persona3);
        libro3.agregarPropietario(persona1);

        persona1.mostrarLibros();
        persona3.mostrarLibros();

        libro1.verPropietario();
        libro2.verPropietario();
    }
}
