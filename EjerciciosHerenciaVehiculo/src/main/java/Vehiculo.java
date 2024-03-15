import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
    private String color;
    private int ruedas;
    public Vehiculo(String color, int ruedas){
        this.color = color;
        this.ruedas = ruedas;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getRuedas() {
        return ruedas;
    }
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    public static void catalogar(List<Vehiculo> vehiculos,int ruedas){
        List<Vehiculo> allVehiculos = new ArrayList<>();
        int cantVeiculos = 0;
        for (Vehiculo vehiculo : vehiculos){
            if (vehiculo.ruedas == ruedas) {
                cantVeiculos ++;
                allVehiculos.add(vehiculo);
            }
        }
        System.out.println("Se han encontrado " + cantVeiculos + " vehículos con " + ruedas + " ruedas.");
        for (Vehiculo vehiculo : allVehiculos){
            System.out.println("Categoría: " + vehiculo.getClass());
            System.out.println("Color: " + vehiculo.getColor());
            System.out.println("Ruedas: " + vehiculo.getRuedas());
        }
    }
}
