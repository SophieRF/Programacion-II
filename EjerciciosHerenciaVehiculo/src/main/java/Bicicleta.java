public class Bicicleta extends Vehiculo {
    private String tipo;
    public Bicicleta(String color, int ruedas, String tipo){
        super(color, ruedas);
        this.tipo = tipo;
    }
}
