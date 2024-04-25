package Ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEjercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Escuela escuela = new Escuela();
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Ver lista de alumnos");
            System.out.println("3. Calcular nota promedio");
            System.out.println("4. Ver alumno con nota más alta");
            System.out.println("5. Buscar alumno por nombre");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");

            try {
                opcion = scan.nextInt();
                scan.nextLine();

                switch (opcion) {
                    case 1:
                        escuela.agregarAlumno();
                        break;
                    case 2:
                        escuela.verListaDeAlumnos();
                        break;
                    case 3:
                        escuela.calcularNotaPromedio();
                        break;
                    case 4:
                        escuela.alumnoConNotaMasAlta();
                        break;
                    case 5:
                        escuela.buscarAlumno();
                        break;
                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese un número del menú.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número.");
                scan.nextLine();
                opcion = -1;
            }
        } while (opcion != 0);
    }
}
