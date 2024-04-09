package Ejercicio10;
public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", "16.5");
        LibroDeTexto libroTexto1 = new LibroDeTexto( "Química Orgánica", "Ana Gómez","Química Avanzada","26.99");
        LibroDeTextoUniversidadNacionalColombia libroUDeColombia1 = new LibroDeTextoUniversidadNacionalColombia("Matemáticas Básicas","Alberto Pérez","Matemáticas para Ingeniería","30.0","Facultad de Ingeniería");
        Novela novela1 = new Novela( "Cien años de soledad","Gabriel García Márquez"," 20.50", "Realista");
        libro1.mostrarInformacion();
        libroTexto1.mostrarInformacion();
        libroUDeColombia1.mostrarInformacion();
        novela1.mostrarInformacion();
    }
}
