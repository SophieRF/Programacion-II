public class CuentaDeAhorros extends Cuenta {
    private boolean estaActiva = saldo > 10000;

    public CuentaDeAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    public boolean isEstaActiva() {
        return estaActiva;
    }
    public void setEstaActiva(boolean estaActiva) {
        this.estaActiva = estaActiva;
    }
    @Override
    public void consignar(float cantidad){
        super.consignar(cantidad);
    }
    @Override
    public void retirar(float cantidad){
        super.retirar(cantidad);
    }
    @Override
    public void extractoMensual() {
        if (numeroRetiros > 4) {
            int retirosAdicionales = numeroRetiros - 4;
            setComisionMensual(comisionMensual + retirosAdicionales * 1000);
        }
        super.extractoMensual();
        estaActiva = saldo > 10000;
        if (estaActiva){
            System.out.println("Cuenta Activa");
        }else {
            System.out.println("Cuenta Inactiva");
        }
    }
    @Override
    public void imprimir(){
        System.out.println("Saldo actual: $"+ getSaldo());
        System.out.println("Comisión mensual: $"+ getComisionMensual());
        System.out.println("Transacciones realizadas: "+ (getNumeroConsignaciones()+ getNumeroRetiros()));
    }
}
