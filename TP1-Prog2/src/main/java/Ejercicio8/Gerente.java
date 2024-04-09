package Ejercicio8;
public class Gerente extends  Empleado{
    private String departamentoDeTrabajo;
    public Gerente(String nombre, int edad, float salario, boolean puedeTrabajar, String departamentoDeTrabajo) {
        super(nombre, edad, salario, puedeTrabajar);
        this.departamentoDeTrabajo = departamentoDeTrabajo;
    }
    public void organizarActividad(){
        System.out.println("Actividad organizada en "+ departamentoDeTrabajo + " por gerente "+ getNombre());
    }
    @Override
    public void verPerfilDelEmpleado(){
        System.out.println("Nombre: "+ getNombre() + "\nEdad: "+ getEdad() + "\nSalario: "+ getSalario()+"\nDepartamento de trabajo: "+ departamentoDeTrabajo +"\n   ---- ---- ---   ");
    }
}
