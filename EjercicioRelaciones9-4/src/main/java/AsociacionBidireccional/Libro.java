package AsociacionBidireccional;
import java.util.ArrayList;
public class Libro {
    private String titulo;
    private ArrayList<Persona> personas = new ArrayList<Persona>();

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList getPersonas() {
        return personas;
    }
    public void setPersonas(ArrayList personas) {
        this.personas = personas;
    }
    public void agregarPropietario(Persona persona){
        personas.add(persona);
    }
    public void verPropietario(){
        System.out.println("Propietarios/as de "+ getTitulo()+":");
        for (Persona persona: personas) {
            System.out.println(persona.getNombre());
        }
    }
}
