import java.util.ArrayList;

public class Prueba {
    private int codigo;
    private String titulo;
    private ArrayList<Instalacion> instalaciones;
    private ArrayList<Atleta> atletas;

    public Prueba(){
    }
    public Prueba(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.instalaciones =  new ArrayList<>();
        this.atletas = new ArrayList<>();
    }
    public Prueba(int codigo, String titulo, ArrayList<Instalacion> instalaciones, ArrayList<Atleta> atletas){
        this.codigo = codigo;
        this.instalaciones = instalaciones;
        this.titulo = titulo;
        this.atletas = atletas;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Instalacion> getInstalaciones() {
        return instalaciones;
    }
    public void setInstalaciones(ArrayList<Instalacion> instalaciones) {
        this.instalaciones = instalaciones;
    }

    public ArrayList<Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(ArrayList<Atleta> atletas) {
        this.atletas = atletas;
    }

    public void agregarAtleta(Atleta atleta){
        atletas.add(atleta);
    }
    public void agregarInstalación(Instalacion instalacion){
        instalaciones.add(instalacion);
    }
}
