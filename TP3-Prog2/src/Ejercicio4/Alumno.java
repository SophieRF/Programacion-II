package Ejercicio4;
public class Alumno {
    private int edad;
    private String nombre;
    private double nota;

    public Alumno(int edad, String nombre, double nota) {
        this.edad = edad;
        this.nombre = nombre;
        this.nota = nota;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nEdad: " + edad + "\nNota: "+ nota + "\n-*--____--*-";
    }
}
