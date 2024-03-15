public class EjerciciosHerenciaAnimal {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Luna",6,"Hembra","Pitbull");
        Gato gato1 = new Gato("Tommy",4,"Macho","Pelo largo");
        Pajaro pajaro1 = new Pajaro("Alba",3,"Hembra","Loro");

        perro1.informacion();
        gato1.informacion();
        pajaro1.hacerSonido();
    }
}
