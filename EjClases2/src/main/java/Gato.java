public class Gato extends Felino implements Vacunacion{
    private String nombre;
    public Gato(String foto, String comida, String localizacion, String tamano, String nombre) {
        super(foto, comida, localizacion, tamano);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void comer(){
        System.out.println("Estoy comiendo"+ getComida());
    };
    @Override
    public void hacerRuido(){
        System.out.println("Miau");
    };
    public void vacunar(){
        System.out.println(getNombre()+" vacunado");
    };
}
