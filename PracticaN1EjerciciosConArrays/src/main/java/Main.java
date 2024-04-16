import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scan.nextInt();
        }
        EjerciciosConArrays ejercicio1 = new EjerciciosConArrays(numeros);
        ejercicio1.verRepeticionDeNumeroMayor();
    }
}