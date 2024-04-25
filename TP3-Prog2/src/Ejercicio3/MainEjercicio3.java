package Ejercicio3;
public class MainEjercicio3 {
    public static void main(String[] args) {
        DiasDeLaSemana ds1 = new DiasDeLaSemana();
        ds1.agregarDia(0, "Lunes");
        ds1.agregarDia(1, "Martes");
        ds1.agregarDia(2, "Miércoles");
        ds1.agregarDia(3, "Jueves");
        ds1.agregarDia(4, "Juernes");
        ds1.agregarDia(5, "Viernes");
        ds1.agregarDia(6, "Sabado");
        ds1.agregarDia(7, "Domingo");
        ds1.verPosiciones(3);
        ds1.verPosiciones(4);
        System.out.println(ds1.verPrimerDia());
        System.out.println(ds1.verUltimoDia());
        ds1.eliminarDia("Juernes");
        ds1.verDiasDeLaLista();
        ds1.buscarDia("LUNES");
        ds1.eliminarTodos();
    }
}
