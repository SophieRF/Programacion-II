package Ejercicio3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Excepciones3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double base = 0;
        double altura = 0;
        double area = 0;
        try {
            System.out.println("Ingrese base del triángulo: ");
            base = scan.nextDouble();
            System.out.println("Ingrese altura: ");
            altura = scan.nextDouble();
            area = (base * altura) / 2;
            System.out.println("El área del triángulo es " + area);
        } catch (InputMismatchException e) {
            System.out.println("Error. Debe ingresar un número: " + e);
        }
    }
}