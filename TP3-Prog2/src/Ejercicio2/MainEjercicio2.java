package Ejercicio2;
public class MainEjercicio2 {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Pedro");
        Empleado e2 = new Empleado("Julia");
        e1.asignarSupervisor(new Empleado("Martín"));
        System.out.println("El supervisor de "+e1.getNombre()+ " es "+ e1.obtenerNombreSupervisor());
    }
}
