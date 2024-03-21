public class Tigre extends Felino{
    private String nombre;
    public Tigre(String foto, String comida, String localizacion, String tamano, String nombre) {
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
        System.out.println("Estoy comiendo "+ getComida());
    };
    @Override
    public void hacerRuido(){
        System.out.println("Roarrr!");
    };
}
