package Ejercicio9;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return (Math.PI * radio * radio);
    }

    @Override
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
