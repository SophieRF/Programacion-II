package Ejercicio3;
import java.util.ArrayList;
import java.util.Iterator;

public class DiasDeLaSemana implements Iterable<String>{
    private ArrayList<String> dias;

    public DiasDeLaSemana() {
        this.dias = new ArrayList<>();
    }

    public ArrayList<String> getDias() {
        return dias;
    }
    public void setDias(ArrayList<String> dias) {
        this.dias = dias;
    }
    public void agregarDia(int posicion,String dia){
        dias.add(posicion, dia);
    }

    @Override
    public Iterator<String> iterator() {
        return dias.iterator();
    }
    public void verPosiciones(int index){
        System.out.println("El día de la posición "+ index + " es " +dias.get(index));
    }
    public String verPrimerDia() {
        Iterator<String> iterator = dias.iterator();
        if (iterator.hasNext()) {
            return iterator.next();
        } else {
            return "La lista está vacía";
        }
    }

    public String verUltimoDia() {
        Iterator<String> iterator = dias.iterator();
        String ultimo = null;
        while (iterator.hasNext()) {
            ultimo = iterator.next();
        }
        if (ultimo != null) {
            return ultimo;
        } else {
            return "La lista está vacía";
        }
    }
    public void eliminarDia(String dia) {
        Iterator<String> iterator = dias.iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            String current = iterator.next();
            if (current.equals(dia)) {
                iterator.remove();
                System.out.println("Se eliminó el día " + dia );
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El día " + dia + " no se encontró en la lista.");
        }
    }
    public void verDiasDeLaLista(){
        System.out.println("DÍAS DE LA SEMANA:");
        for (String dia : dias){
            System.out.println(dia);
        }
    }
    public void buscarDia(String nombreDelDia){
        for (String dia : dias){
            if (nombreDelDia.equalsIgnoreCase(dia)) {
                System.out.println("Se encontró el día "+ nombreDelDia + "!");
                break;
            }else{
                System.out.println("No se encontró el día "+ nombreDelDia + " en la lista");
                break;
            }
            }
        }
    public void eliminarTodos() {
        Iterator<String> iterator = dias.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println("Se eliminaron todos los días de la lista.");
    }
}


