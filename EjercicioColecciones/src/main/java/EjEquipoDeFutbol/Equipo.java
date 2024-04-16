package EjEquipoDeFutbol;
import java.util.Iterator;
public class Equipo implements Iterable<Jugador>{
    private int indice;
    private Jugador[] jugadores;

    public Equipo(Jugador[] jugadores) {
        this.jugadores = jugadores;
        this.indice = 0;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public Iterator<Jugador> iterator() {
        return new Iterator<Jugador>() {
            @Override
            public boolean hasNext() {
                return indice < jugadores.length;
            }

            @Override
            public Jugador next() {
                return jugadores[indice++];
            }
        };

    }
}

