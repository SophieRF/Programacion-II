package Ejercicio10;
public class Libro {
    private String titulo;
    private String autor;
    private String precio;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public Libro(String titulo, String autor, String precio){
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPrecio() {
        return precio;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    public void mostrarInformacion(){
        System.out.println("Título: "+getTitulo()+"\nAutor/a: "+getAutor()+"\nPrecio: $"+getPrecio());
    }
}
