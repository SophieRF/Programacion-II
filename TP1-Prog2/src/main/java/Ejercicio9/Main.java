package Ejercicio9;
public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(4.5);
        Rectangulo r1 = new Rectangulo(8, 6);
        System.out.println("Área del círuclo: "+ c1.calcularArea()+"\nPerímetro del círculo: "+c1.calcularPerimetro());
        System.out.println("Área del rectángulo: "+ r1.calcularArea()+"\nPerímetro del rectángulo: "+r1.calcularPerimetro());
    }
}
