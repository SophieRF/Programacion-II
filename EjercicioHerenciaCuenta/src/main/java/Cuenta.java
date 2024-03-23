public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;
    public Cuenta(float saldo, float tasaAnual){
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public float getSaldo() {return saldo; }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public int getNumeroConsignaciones() {
        return numeroConsignaciones;
    }
    public void setNumeroConsignaciones(int numeroConsignaciones) {
        this.numeroConsignaciones = numeroConsignaciones;
    }
    public int getNumeroRetiros() {
        return numeroRetiros;
    }
    public void setNumeroRetiros(int numeroRetiros) {
        this.numeroRetiros = numeroRetiros;
    }
    public float getTasaAnual() {
        return tasaAnual;
    }
    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }
    public float getComisionMensual() {
        return comisionMensual;
    }
    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }

    public void consignar(float cantidad){
        saldo += cantidad;
        numeroConsignaciones ++;
    }
    public void retirar(float cantidad){
        if (cantidad <= saldo){
            saldo -= cantidad;
            numeroRetiros++;
        }else {
            System.out.println("Saldo insuficiente, usted tiene en su cuenta $"+ getSaldo() + " disponible");
        }
    }
    public void calcularInteresMensual(){
        float interesMensual = (saldo * tasaAnual)/12;
        saldo += interesMensual;
    }
    public void extractoMensual(){
        saldo -= comisionMensual;
        calcularInteresMensual();
    }
    public void imprimir(){
        System.out.println("Saldo: $"+saldo);
        System.out.println("Número de consignaciones:"+numeroConsignaciones);
        System.out.println("Número de retiros realizados: "+numeroRetiros);
        System.out.println("Tasa anual: "+tasaAnual);
        System.out.println("Comisión mensual: $"+comisionMensual);
    }
}
