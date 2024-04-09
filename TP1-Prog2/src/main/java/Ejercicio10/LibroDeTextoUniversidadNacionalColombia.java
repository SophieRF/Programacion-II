package Ejercicio10;

public class LibroDeTextoUniversidadNacionalColombia extends LibroDeTexto{
    private String facultadDondeSePublica;
    public LibroDeTextoUniversidadNacionalColombia(String titulo, String autor, String cursoAsociado, String precio, String facultadDondeSePublica) {
        super(titulo, autor, cursoAsociado, precio);
        this.facultadDondeSePublica = facultadDondeSePublica;
    }

    public String getFacultadDondeSePublica() {
        return facultadDondeSePublica;
    }
    public void setFacultadDondeSePublica(String facultadDondeSePublica) {
        this.facultadDondeSePublica = facultadDondeSePublica;
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("Título: "+getTitulo()+"\nAutor/a: "+getAutor()+"\nPrecio: $"+getPrecio()+"\nFacultad donde se publicó: "+getFacultadDondeSePublica());
    }
}
