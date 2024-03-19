public class Directivo extends Empleado{
    private int DNI;

    public Directivo(int directivoID, String nombre) {
        super(nombre);
        this.DNI = DNI;
    }

    public int getDNI() {

        return DNI;
    }
    public void setDNI(int directivoID) {

        this.DNI = DNI;
    }

    public String toString(){

        return "Datos Directivo:\nNombre: " + getNombre() + "\nDNI: " + getDNI();
    }

}
