package Ejercicio8;
public class Trabajador extends Empleado{
    private String areaDeTrabajo;
    public Trabajador(String nombre, int edad, float salario, boolean puedeTrabajar, String areaDeTrabajo) {
        super(nombre, edad, salario, puedeTrabajar);
        this.areaDeTrabajo = areaDeTrabajo;
    }
    public void producir(){
        System.out.println("Realizando producción en "+ areaDeTrabajo);
    }
    @Override
    public void verPerfilDelEmpleado(){
        System.out.println("Nombre: "+ getNombre() + "\nEdad: "+ getEdad() + "\nSalario: "+ getSalario()+"\nArea de trabajo: "+ areaDeTrabajo +"\n   ---- ---- ---   ");
    }
}
