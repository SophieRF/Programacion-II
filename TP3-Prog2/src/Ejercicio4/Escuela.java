package Ejercicio4;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
public class Escuela implements Iterable<Alumno>{
    Scanner scan = new Scanner(System.in);
    private ArrayList<Alumno> alumnos;
    public Escuela() {
        this.alumnos = new ArrayList<>();
    }
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    @Override
    public Iterator<Alumno> iterator() {
        return alumnos.iterator();
    }
    public void agregarAlumno() {
        while (true) {
            try {
                System.out.println("Ingrese el nombre del alumno/a que desea registrar: ");
                String nombre = scan.nextLine();

                System.out.println("Ingrese la edad del alumno/a: ");
                int edad = scan.nextInt();
                scan.nextLine();

                if (edad < 12 || edad > 18) {
                    System.out.println("Edad no válida. Debe estar entre 12 y 18 años.");
                    continue;
                }

                System.out.println("Ingrese la nota del alumno/a: ");
                double nota = scan.nextDouble();
                scan.nextLine();

                alumnos.add(new Alumno(edad, nombre, nota));
                System.out.println("Alumno/a agregado/a exitosamente");
                break;

            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número para la edad y la nota.");
                scan.nextLine();
                continue;
            }
        }
    }
    public void verListaDeAlumnos(){
        for (Alumno alumno: alumnos){
            System.out.println(alumno.toString());
        }
    }
    public void calcularNotaPromedio(){
        int contador = 0;
        double sumatoria = 0;
        double promedio = 0;
        for (Alumno alumno : alumnos){
            contador++;
            sumatoria += alumno.getNota();
        }
        promedio = sumatoria/contador;
        System.out.println("El promedio de notas de los alumnos y alumnas es de " + promedio);
    }
    public void alumnoConNotaMasAlta(){
        double notaMasAlta = 0;
        ArrayList notaMasAltas = new ArrayList();
        for (Alumno alumno: alumnos){
            if (alumno.getNota() > notaMasAlta){
                notaMasAlta = alumno.getNota();
            }
        }
        for (Alumno alumno: alumnos){
            if (alumno.getNota() == notaMasAlta){
                notaMasAltas.add(alumno);
            }
        }
        System.out.println("El/los alumnos/as con nota más alta es/son "+ notaMasAltas);
    }
    public void buscarAlumno(){
        System.out.println("Ingrese nombre del alumno/a que desea buscar: ");
        String nombreAlumno = scan.nextLine();
        boolean encontrado = false;
        for (Alumno alumno: alumnos){
            if (nombreAlumno.equalsIgnoreCase(alumno.getNombre())){
                encontrado = true;
                System.out.println(alumno.toString());
                break;
            }
        }
        if (!encontrado){
            System.out.println("No se encontró el alumno/a de nombre "+ nombreAlumno);
        }
    }
}


