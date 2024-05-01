import java.util.ArrayList;
public class Instalacion {
    private String categoria;
    private String localizacion;
    private String nombre;
    private String tipo;
    private ArrayList<Prueba> pruebas;
    public Instalacion(){
    }

    public Instalacion(String categoria, String localizacion, String nombre, String tipo) {
        this.categoria = categoria;
        this.localizacion = localizacion;
        this.nombre = nombre;
        this.tipo = tipo;
        this.pruebas = new ArrayList<>();
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLocalizacion() {
        return localizacion;
    }
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Prueba> getPruebas() {
        return pruebas;
    }
    public void setPruebas(ArrayList<Prueba> pruebas) {
        this.pruebas = pruebas;
    }
    public void agregarPrueba(Prueba prueba){
        pruebas.add(prueba);
    }
}
