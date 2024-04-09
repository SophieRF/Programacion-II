package Ejercicio10;
public class LibroDeTexto extends  Libro{
    private String cursoAsociado;
    public LibroDeTexto(String titulo, String autor, String cursoAsociado, String precio) {
        super(titulo, autor, precio);
        this.cursoAsociado = cursoAsociado;
    }

    public String getCursoAsociado() {
        return cursoAsociado;
    }
    public void setCursoAsociado(String cursoAsociado) {
        this.cursoAsociado = cursoAsociado;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Título: "+getTitulo()+"\nAutor/a: "+getAutor()+"\nPrecio: $"+getPrecio()+"\nCurso: "+ getCursoAsociado());
    }
}
