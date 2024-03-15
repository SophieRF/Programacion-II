public class Pajaro extends Animal{
    private String especie;
    public Pajaro(String nombre, int edad, String sexo, String especie) {
        super(nombre, edad, sexo);
        this.especie = especie;
    }
    public void hacerSonido(){
        System.out.println("Canto de ave");
    }

    @Override
    public void informacion() {
        super.informacion();
        System.out.println("Especie: "+ especie);
    }
}
