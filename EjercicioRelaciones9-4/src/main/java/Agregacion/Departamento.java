package Agregacion;
import java.util.ArrayList;
public class Departamento {
    private String nombre;
    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    public void eliminarEmpleado(Empleado empleado){
        empleados.remove(empleado);
    }
    public void mostrarEmpleados(){
        System.out.println("Empleados/as del departamento "+ getNombre()+":");
        for (Empleado empleado: empleados){
            empleado.verInformacion();
        }
    }
}
