package Ejercicio5;
import java.util.*;
public class ListaDeTareas implements Iterable<Tarea>{
    Scanner scan = new Scanner(System.in);
    private ArrayList<Tarea> listaTareas;
    public ListaDeTareas() {
        this.listaTareas = new ArrayList<>();
    }

    public ArrayList<Tarea> getListaTareas() {
        return listaTareas;
    }
    public void setListaTareas(ArrayList<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    @Override
    public Iterator<Tarea> iterator() {
        return listaTareas.iterator();
    }
    public void agregarTarea() {
        while (true) {
            try {
                System.out.println("Ingrese la descripción de la tarea que desea agregar: ");
                String descripcion = scan.nextLine();

                System.out.println("Ingrese la prioridad de la tarea: ");
                int prioridad = scan.nextInt();
                scan.nextLine();

                for (Tarea tarea : listaTareas) {
                    if (tarea.getPrioridad() == prioridad) {
                        System.out.println("Ese número de prioridad le corresponde a otra tarea");
                        break;
                    }
                }
                listaTareas.add(new Tarea(descripcion, prioridad));
                System.out.println("Tarea agregada exitosamente");
                break;

            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número para la prioridad");
                scan.nextLine();
                continue;
            }
        }
    }
    public void eliminarTarea(String descripcionTarea) {
        Iterator<Tarea> iterator = listaTareas.iterator();
        boolean encontrada = false;

        while (iterator.hasNext()) {
            Tarea tarea = iterator.next();
            if (descripcionTarea.equalsIgnoreCase(tarea.getDescripcion())) {
                iterator.remove();
                System.out.println("Se removió " + descripcionTarea + " de la lista de tareas.");
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("La tarea " + descripcionTarea + " no se puede remover porque no existe en la lista de tareas");
        }
    }
    public int verNumeroTotalDeTareas(){
        int sumatoria = 0;
        for (Tarea tarea: listaTareas){
            sumatoria++;
        }
        return sumatoria;
    }
    public void verTareasPorPrioridadDescendiente() {
        Collections.sort(listaTareas, new Comparator<Tarea>() {
            @Override
            public int compare(Tarea tarea1, Tarea tarea2) {
                return tarea1.getPrioridad() - tarea2.getPrioridad();
            }
        });
        for (Tarea tarea : listaTareas) {
            System.out.println(tarea.getDescripcion());
        }
    }
}


