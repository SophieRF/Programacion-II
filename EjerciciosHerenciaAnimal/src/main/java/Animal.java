public abstract class Animal {
    private String nombre;
    private int edad;
    private String sexo;

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getSexo() {
        return sexo;
    }
    public Animal(String nombre, int edad, String sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    public void hacerSonido(){
        System.out.println("El animal hace un sonido genérico");
    }
    public void informacion(){
        System.out.println("Información del animal:\nNombre: " + nombre + "\nEdad: " + edad + "\nSexo: " + sexo);
    }
}
