package Agregacion;
public class Main {
    public static void main(String[] args) {
        Departamento dep1 = new Departamento("Departamento1");
        Empleado em1 = new Empleado("Secretaría", "Luis");
        Empleado em2 = new Empleado("Recepcionista", "Laura");
        Empleado em3 = new Empleado("Ejecutivo", "Ana");

        dep1.agregarEmpleado(em1);
        dep1.agregarEmpleado(em2);
        dep1.mostrarEmpleados();

        dep1.agregarEmpleado(em3);
        dep1.mostrarEmpleados();
    }
}
