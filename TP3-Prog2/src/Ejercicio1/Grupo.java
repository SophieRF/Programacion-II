package Ejercicio1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Grupo implements Iterable<Alumno> {
    private String curso;
    private char letra;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Asignatura> asignaturas;

    public Grupo(String curso, char letra) {
        this.curso = curso;
        this.letra = letra;
        this.alumnos = new ArrayList<>();
        this.asignaturas = new ArrayList<>();
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public char getLetra() {
        return letra;
    }
    public void setLetra(char letra) {
        this.letra = letra;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }
    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public void agregarAlumno(int dni, String nombre){
        Alumno a1 = new Alumno(this, dni, nombre);
        alumnos.add(a1);
    }
    public void mostrarAlumnos(){
        System.out.println("Alumnos del grupo "+ getCurso()+ ": ");
        for (Alumno alumno: this){
            System.out.println("Nombre: "+alumno.getNombre()+"\nDNI: "+ alumno.getDni()+ "\n-- -- --");
        }
    }
    public Alumno accederAlumnoPorDNI(int dni) {
        for (Alumno alumno : this) {
            if (dni == alumno.getDni()) {
                return alumno;
            }
        }
        return null;
    }
    public void agregarAsignatura(Asignatura asignatura){
        asignaturas.add(asignatura);
    }
    public void mostrarAsignaturas(){
        System.out.println("Asignaturas del grupo "+ getLetra()+ ":");
        for (int i =0; i< asignaturas.size(); i++){
            System.out.println(asignaturas.get(i).getNombre());
        }
    }
    @Override
    public Iterator<Alumno> iterator() {
        return alumnos.iterator();
        };

}
