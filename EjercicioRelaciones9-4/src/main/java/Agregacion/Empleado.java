package Agregacion;
public class Empleado {
    private String cargo;
    private String nombre;

    public Empleado(String cargo, String nombre) {
        this.cargo = cargo;
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void verInformacion(){
        System.out.println("Nombre: "+ getNombre()+ "\nCargo: "+getCargo());
    }
}
