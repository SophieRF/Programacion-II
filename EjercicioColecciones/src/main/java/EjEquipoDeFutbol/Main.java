package EjEquipoDeFutbol;
public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo(new Jugador[]{new Jugador("Jugador1", "Delantero", 5), new Jugador("Jugador2", "Defensor", 10), new Jugador("Jugador3", "Arquero", 1)});
        for(Jugador jugador: equipo){
            jugador.verInformacion();
        }
    }
}
