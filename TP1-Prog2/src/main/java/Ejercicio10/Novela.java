package Ejercicio10;
public class Novela extends Libro{
    private String genero;
    public Novela(String titulo, String autor, String precio, String genero) {
        super(titulo, autor, precio);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("Título: "+getTitulo()+"\nAutor/a: "+getAutor()+"\nPrecio: $"+getPrecio()+ "\nGénero: "+getGenero());
    }
}
