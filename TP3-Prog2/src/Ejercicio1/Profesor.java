package Ejercicio1;
import java.util.ArrayList;
import java.util.Iterator;
public class Profesor extends Persona implements Iterable<Asignatura> {
    private String departamento;
    private ArrayList<Asignatura> asignaturas;

    public Profesor(int dni, String nombre, String departamento) {
        super(dni, nombre);
        this.departamento = departamento;
        this.asignaturas = new ArrayList<>();
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }
    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
    public void agregarAsignatura(Asignatura asignatura){
        asignaturas.add(asignatura);
    }
    public void mostrarAsignaturas(){
        System.out.println("Asignaturas dictadas por profesor/a "+ getNombre()+ ": ");
        for (Asignatura asignatura: this){
            System.out.println(asignatura.getNombre());
        }
        System.out.println("**--..--**");
    }
    @Override
    public Iterator<Asignatura> iterator() {
        return asignaturas.iterator();
    }

    public void verAlumnosInscriptosEnAsignatura(int indiceDeAsignatura){
        System.out.println("Alumnos inscriptos a la asignatura "+ this.getAsignaturas().get(indiceDeAsignatura).getNombre()+":");
        for (int i = 0; i < this.getAsignaturas().get(indiceDeAsignatura).getGrupo().getAlumnos().size(); i++){
            System.out.println(this.getAsignaturas().get(indiceDeAsignatura).getGrupo().getAlumnos().get(i).getNombre());
        }
    }
}
