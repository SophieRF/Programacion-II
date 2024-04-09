package AsociacionUnidireccional;
public class Estudiante {
    private String nombre;
    private Universidad universidad;

    public Estudiante(String nombre, Universidad universidad) {
        this.nombre = nombre;
        this.universidad = universidad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Universidad getUniversidad() {
        return universidad;
    }
    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
    public void verUniversidad(){
        System.out.println("Universidad actual de "+getNombre()+": "+getUniversidad().getNombre());
    }
    public void cambiarUniversidad(Universidad newUniversidad){
        setUniversidad(newUniversidad);
        System.out.println(getNombre()+" cambió a de universidad a "+getUniversidad().getNombre());
    }
}
