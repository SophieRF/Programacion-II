import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class EjerciciosHerenciaVehiculo {
    public static void main(String[] args) {
        Coche co1 = new Coche("Gris",4,120,2000);
        Camioneta ca1 = new  Camioneta("Blanco",4,900);
        Bicicleta b1 = new Bicicleta("Rojo",2,"deportiva");
        Motocicleta m1 = new Motocicleta("Negro",2,180, 600);
        List<Vehiculo> vehiculos = new ArrayList<>(Arrays.asList(co1,ca1,b1,m1));
        Vehiculo.catalogar(vehiculos, 2);
    }
}