package Ejercicio8;
public abstract class Empleado {
    private String nombre;
    private int edad;
    private float salario;
    boolean puedeTrabajar;

    public Empleado(String nombre, int edad, float salario, boolean puedeTrabajar) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.puedeTrabajar = puedeTrabajar;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public boolean isPuedeTrabajar() {
        return puedeTrabajar;
    }
    public void setPuedeTrabajar(boolean puedeTrabajar) {
        this.puedeTrabajar = puedeTrabajar;
    }
    public void verPerfilDelEmpleado(){
    }
}
