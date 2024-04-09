package Ejercicio8;
public class Main {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Ana",35,200,true,"Mendoza");
        Trabajador trabajador1 = new Trabajador("Juan",40,150,true,"San José");
        gerente1.verPerfilDelEmpleado();
        gerente1.organizarActividad();
        trabajador1.verPerfilDelEmpleado();
        trabajador1.producir();
    }
}
