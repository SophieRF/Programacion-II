public class Motocicleta extends Vehiculo {
    private double velocidad;
    private double cilindrada;
    public  Motocicleta(String color, int ruedas,double velocidad, double cilindrada){
        super(color,ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }
}