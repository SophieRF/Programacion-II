public class Tecnico extends Operario{
    int tecnicoID;
    public Tecnico(int tecnicoID){
        this.tecnicoID = tecnicoID;
    }

    public int getTecnicoID() {
        return tecnicoID;
    }
    public void setTecnicoID(int tecnicoID) {
        this.tecnicoID = tecnicoID;
    }
    public String toString(){
        return "ID: " + tecnicoID;
    };
}
