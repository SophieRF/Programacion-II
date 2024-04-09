package Composicion;
import java.util.ArrayList;
public class Casa {
    private ArrayList<Puerta> puertas;
    public Casa(){
        this.puertas = new ArrayList<>();
        puertas.add(new Puerta("Madera"));
        puertas.add(new Puerta("Metal"));
    }
    public Casa(ArrayList<Puerta> puertas){
        this.puertas = puertas;
    }
    public ArrayList<Puerta> getPuertas() {
        return puertas;
    }
    public void setPuertas(ArrayList<Puerta> puertas) {
        this.puertas = puertas;
    }
    public void mostrarMaterial(){
        for (Puerta puerta: puertas){
            System.out.println(puerta.getMaterial());
        }
    }
}
