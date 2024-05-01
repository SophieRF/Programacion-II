public class Atleta extends Persona implements Contrato{
    private double altura;
    private int edad;
    double peso;

    public Atleta(int dni, String nombre, double altura, int edad, double peso) {
        super(dni, nombre);
        this.altura = altura;
        this.edad = edad;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double calcularIMC(double peso, double altura) {
        double IMC = peso / Math.pow(altura, 2);
        return IMC;
    }

    @Override
    public boolean hayPesoExtra(double IMC) {
        boolean pesoExtra;
        if (IMC >= 25){
            pesoExtra = true;
        }else {
            pesoExtra = false;
        }
        return pesoExtra;
    }

    @Override
    public double tomarPulsaciones() {
        return 0;
    }
}
