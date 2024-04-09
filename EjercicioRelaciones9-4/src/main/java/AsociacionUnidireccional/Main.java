package AsociacionUnidireccional;
public class Main {
    public static void main(String[] args) {
        Universidad universidad1 = new Universidad("UTN");
        Universidad universidad2 = new Universidad("UNC");
        Estudiante estudiante1 = new Estudiante("Sofia", universidad2);
        estudiante1.verUniversidad();
        estudiante1.cambiarUniversidad(universidad1);
        estudiante1.verUniversidad();
    }
}

