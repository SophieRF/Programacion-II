package Ejercicio1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Alumno extends Persona implements Iterable {
    Scanner scan = new Scanner(System.in);
    private ArrayList<Grupo> grupos;

    public Alumno(Grupo grupo, int dni, String nombre) {
        super(dni, nombre);
        this.grupos = new ArrayList<>();
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    public void agregarGrupo(Grupo grupo) {
        grupos.add(grupo);
    }

    public void verGrupos() {
        System.out.println("Grupos a los que pertenece alumno/a " + getNombre() + ":");
        for (Grupo grupo : grupos) {
            System.out.println(grupo.getLetra());
        }
    }

    @Override
    public Iterator iterator() {
        return grupos.iterator();
    }

    public void conocerProfesor() {
        System.out.println("Ingrese asignatura de la que desea saber su profesor/a responsable: ");
        String asignatura = scan.nextLine();
        boolean encontrada = false;

        for (Grupo grupo : grupos) {
            for (Asignatura a : grupo.getAsignaturas()) {
                if (a.getNombre().equalsIgnoreCase(asignatura)) {
                    System.out.println("Profesor/a de la asignatura " + asignatura + ": " + a.getProfesor().getNombre());
                    encontrada = true;
                    break;
                }
            }
            if (encontrada) {
                break;
            }
        }
        if (!encontrada) {
            System.out.println("La asignatura " + asignatura + " no se encontró en este grupo");
        }
    }
}
