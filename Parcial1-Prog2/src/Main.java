public class Main {
    public static void main(String[] args) {
        Atleta a1 = new Atleta(35643456, "Juan Perez", 1.72, 30, 70);
        Atleta a2 = new Atleta(37123546, "María Rodriguez", 1.68, 30, 64.5);
        Atleta a3 = new Atleta(40432321, "Martín Gonzales", 1.70, 30, 78.5);
        Atleta a4 = new Atleta(35765456, "Ana Díaz", 1.65, 26, 67);
        Atleta a5 = new Atleta(38109846, "Luis Sanchez", 1.71, 28, 72.3);
        Atleta a6 = new Atleta(40499221, "Benjamín Gomez", 1.70, 29, 76.5);

        EquipoNacional en1 = new EquipoNacional("Azul", "Argentina");

        Prueba p1 = new Prueba(456, "Carrera");
        Prueba p2 = new Prueba(567, "Salto vertical");
        Prueba p3 = new Prueba(678, "Lanzamiento de javalina");

        p1.agregarAtleta(a1);
        p1.agregarAtleta(a2);
        p2.agregarAtleta(a3);
        p2.agregarAtleta(a4);
        p2.agregarAtleta(a5);
        p3.agregarAtleta(a6);

        Instalacion i1 = new Instalacion("A", "Argentina", "Salón Olímpico","Semitechado");
        i1.agregarPrueba(p1);
        i1.agregarPrueba(p2);
        i1.agregarPrueba(p3);

        en1.agregarAtleta(a1);
        en1.agregarAtleta(a2);
        en1.agregarAtleta(a3);

        System.out.println("La segunda prueba del " + i1.getNombre() + " es "+ i1.getPruebas().get(1).getTitulo() + " y el 3er atleta que la realiza es "+ i1.getPruebas().get(1).getAtletas().get(2).getNombre());
        en1.verAlturaAtletas();
        en1.verPesoExtraAtletas();
    }
}