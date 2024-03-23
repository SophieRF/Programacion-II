public class Main {
    public static void main(String[] args) {
        CuentaDeAhorros ca1 = new CuentaDeAhorros(12000,0.05f);
        ca1.retirar(1000);
        ca1.retirar(1000);
        ca1.retirar(500);
        ca1.retirar(1200);
        ca1.retirar(1300);
        ca1.extractoMensual();
        ca1.consignar(12000);
        ca1.imprimir();
        ca1.extractoMensual();
    }
}
