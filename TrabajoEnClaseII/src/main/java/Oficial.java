public class Oficial extends Operario{
    private int oficialID;
    public Oficial(int oficialID){
        this.oficialID = oficialID;
    }

    public int getOficialID() {
        return oficialID;
    }
    public void setOficialID(int oficialID) {
        this.oficialID = oficialID;
    }
    public String toString(){
        return "ID: " + getOficialID();
    };
}
