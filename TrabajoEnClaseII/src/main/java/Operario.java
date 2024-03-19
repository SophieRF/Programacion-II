public class Operario extends Empleado{
    private int DNI;
    public Operario(){
    }
    public Operario(int DNI, String nombre) {
        super(nombre);
        this.DNI = DNI;
    }

    public int getDNI() {
        return DNI;
    }
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    public String toString(){
        return "Datos operario:\nNombre: " + getNombre() + "\nDNI: " + getDNI();
    }
}
