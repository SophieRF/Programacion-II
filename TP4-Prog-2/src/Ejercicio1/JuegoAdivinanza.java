package Ejercicio1;
import java.util.Random;
import java.util.Scanner;
public class JuegoAdivinanza {
    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    private int numeroAlAzar = random.nextInt(101);
    private int numeroDeIntentos = 0;

    public JuegoAdivinanza() {
    }
    public void adivinarNumeroAleatorio(){
        int numeroIngresado;
        System.out.println("Adivina el número oculto! Su valor está entre el 1 y el 100");
        while (true) {
            System.out.print("Introduce tu intento: ");
            try {
                int intento = scan.nextInt();
                numeroDeIntentos++;

                if (intento == numeroAlAzar) {
                    System.out.println("Felicidades!! Adivinaste el número en " + numeroDeIntentos + " intentos!");
                    break;
                } else if (intento < numeroAlAzar) {
                    System.out.println("El número que tienes que adivinar es mayor que " + intento + ".");
                } else {
                    System.out.println("El número que tienes que adivinar es menor que " + intento + ".");
                }
            } catch (Exception e) {
                System.out.println("Valor no válido, debes introducir un número");
                scan.next();
                numeroDeIntentos++;
            }
        }

        scan.close();
    }
}
