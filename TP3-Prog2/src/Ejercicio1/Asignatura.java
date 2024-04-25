package Ejercicio1;
public class Asignatura {
    private int aula;
    private String hora;
    private String nombre;
    private Grupo grupo;
    private Profesor profesor;
    public Asignatura(){
    }

    public Asignatura(int aula, String hora, String nombre, Grupo grupo, Profesor profesor) {
        this.aula = aula;
        this.hora = hora;
        this.nombre = nombre;
        this.grupo = grupo;
        this.profesor = profesor;
    }

    public int getAula() {
        return aula;
    }
    public void setAula(int aula) {
        this.aula = aula;
    }

    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Grupo getGrupo() {
        return grupo;
    }
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
