package Ejercicio1;
import java.util.Scanner;
public class MainEjercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Grupo g1 = new Grupo("Turno mañana",'A');
        Grupo g2 = new Grupo("Turno tarde", 'B');
        Grupo g3 = new Grupo("Turno noche", 'C');

        Profesor p1 =  new Profesor(40765987, "María", "Godoy Cruz");
        Profesor p2 = new Profesor(42778987, "Carlos", "Ciudad");

        Asignatura a1 = new Asignatura(3, "08:00", "Matemáticas", g1, p1);
        Asignatura a2 = new Asignatura(1, "10:00", "Biología", g1, p2);
        Asignatura a3 = new Asignatura(4, "09:00", "Antropología", g1, p1);

        p1.agregarAsignatura(a1);
        p2.agregarAsignatura(a2);
        p1.agregarAsignatura(a3);

        g1.agregarAlumno(42345643, "Juan");
        a1.getGrupo().accederAlumnoPorDNI(42345643).agregarGrupo(g1);
        g1.agregarAlumno(42327543, "Ana");
        g1.agregarAlumno(42125119, "Francisco");
        g1.agregarAlumno(41557619, "Julia");
        g2.agregarAlumno(42345643,"Juan");
        a1.getGrupo().accederAlumnoPorDNI(42345643).agregarGrupo(g2);
        g3.agregarAlumno(42345643,"Juan");
        a1.getGrupo().accederAlumnoPorDNI(42345643).agregarGrupo(g3);

        g1.agregarAsignatura(a1);
        g1.agregarAsignatura(a2);

        for (int i = 0; i < p1.getAsignaturas().size(); i++) {
            if (i == 2){
                System.out.println("Aula de la tercer asignatura: Aula "+ p1.getAsignaturas().get(i).getAula());
            }
        }
        p1.mostrarAsignaturas();
        System.out.println("El tercer grupo de Juan es el grupo "+a1.getGrupo().accederAlumnoPorDNI(42345643).getGrupos().get(2).getLetra());
        g1.accederAlumnoPorDNI(42345643).getGrupos().get(0).mostrarAsignaturas();
        g1.accederAlumnoPorDNI(42345643).conocerProfesor();
        p1.verAlumnosInscriptosEnAsignatura(1);
        //h. Responda: ¿En qué se diferencian una asociación de una composición y de una agregación?
        /*Una asociación es una relación donde no existe codependencia de las partes, ya que son objetos
        que se crean de manera independiente y mantienen una conexión con un objetivo puntual que no afecta la existencia
        o funcionamiento de cada clase.
         En el caso de la composición la relación es de dependencia, ya que una clase pertenece a otra y se crea dentro
        de ella, por lo tanto, si la clase contenedora es eliminada, la clase contenida en ella deja de existir.
         En la agregación existe una independencia de las clases, pero una clase puede estar contenida en otra, solo que
        a su vez puede existir por fuera de la clase contenedora, lo que hace que la dependencia sea mucho mas débil que
        en el caso de la composición.*/

    }
}
