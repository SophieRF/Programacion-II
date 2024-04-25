package Ejercicio5;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MainEjercicio5 {
    public static void main(String[] args) {
        ListaDeTareas listaDeTareas = new ListaDeTareas();
        Scanner scan = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Ver número total de tareas");
            System.out.println("4. Ver tareas por prioridad descendente");
            System.out.println("5. Salir");
            System.out.println("Ingrese su opción:");

            try {
                opcion = scan.nextInt();

                switch (opcion) {
                    case 1:
                        listaDeTareas.agregarTarea();
                        break;
                    case 2:
                        System.out.println("Ingrese la descripción de la tarea que desea eliminar:");
                        String descripcionEliminar = scan.next();
                        listaDeTareas.eliminarTarea(descripcionEliminar);
                        break;
                    case 3:
                        int totalTareas = listaDeTareas.verNumeroTotalDeTareas();
                        System.out.println("El número total de tareas es: " + totalTareas);
                        break;
                    case 4:
                        System.out.println("Tareas por prioridad descendente: ");
                        listaDeTareas.verTareasPorPrioridadDescendiente();
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese una opción válida (1-5).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número.");
                scan.nextLine();
                opcion = 0;
            }
        } while (opcion != 5);

        scan.close();
    }
}

