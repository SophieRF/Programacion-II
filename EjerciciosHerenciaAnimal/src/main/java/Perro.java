public class Perro extends Animal{
    private String raza;
    public Perro(String nombre, int edad, String sexo, String raza) {
        super(nombre, edad, sexo);
        this.raza = raza;
    }
    public void hacerSonido(){
        System.out.println("Ladrido");
    }

    @Override
    public void informacion() {
        super.informacion();
        System.out.println("Raza: " + raza);
    }
}
