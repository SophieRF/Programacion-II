public class Main {
    public static void main(String[] args) {
        Directivo directivo1 = new Directivo(32567432,"Juan Martinez");
        Oficial oficial1 = new Oficial(01);
        Operario operario1 = new Operario(36432456,"Ana López");
        Tecnico tecnico1 = new Tecnico(02);

        System.out.println(oficial1.toString());
        System.out.println(tecnico1.toString());
        System.out.println(operario1.toString());
        System.out.println(directivo1.toString());
    }
}
