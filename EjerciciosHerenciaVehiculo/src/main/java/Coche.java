public class Coche extends Vehiculo {
    private double velocidad;
    private double cilindrada;
    public Coche(String color, int ruedas, double velocidad, double cilindrada){
        super(color,ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }
}
