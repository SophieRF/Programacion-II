import java.util.ArrayList;
import java.util.Iterator;
public class EquipoNacional implements Iterable<Atleta>{
    private String color;
    private String pais;
    private ArrayList<Atleta> atletas;

    public EquipoNacional(String color, String pais) {
        this.color = color;
        this.pais = pais;
        atletas = new ArrayList<>();
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Atleta> getAtletas() {
        return atletas;
    }
    public void setAtletas(ArrayList<Atleta> atletas) {
        this.atletas = atletas;
    }
    public void agregarAtleta(Atleta atleta){
        atletas.add(atleta);
    }

    @Override
    public Iterator<Atleta> iterator() {
        return atletas.iterator();
    }
    public void verAlturaAtletas(){
        System.out.println("Altura de los atletas del Equipo Nacional de "+this.getPais()+":");
        for (Atleta atleta: atletas){
            System.out.println("Altura de "+ atleta.getNombre() + ": " + atleta.getAltura());
        }
    }
    public void verPesoExtraAtletas(){
        System.out.println("Peso extra de los/as atletas del Equipo Nacional de "+ this.getPais());
        for (Atleta atleta: atletas){
            if (atleta.hayPesoExtra(atleta.calcularIMC(atleta.getPeso(), atleta.getAltura())) == true){
                System.out.println("El/la atleta "+ atleta.getNombre()+ " tiene peso extra");
            }else {
                System.out.println("El/la atleta "+ atleta.getNombre()+ " no tiene peso extra");
            }
        }
    }
}
