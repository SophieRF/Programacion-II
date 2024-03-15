public class Gato extends Animal{
    private String pelaje;
    public Gato(String nombre, int edad, String sexo, String pelaje) {
        super(nombre, edad, sexo);
        this.pelaje = pelaje;
    }
    public void hacerSonido(){
        System.out.println("Maullido");
    }

    @Override
    public void informacion() {
        super.informacion();
        System.out.println("Pelaje: "+ pelaje);
    }
}
