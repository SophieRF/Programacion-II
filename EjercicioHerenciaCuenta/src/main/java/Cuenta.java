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

    public float getSaldo() {
        return saldo;
    }
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
    /*Métodos:
        Consignar una cantidad de dinero en la cuenta actualizando su saldo.
     Retirar una cantidad de dinero en la cuenta actualizando su saldo. El valor a retirar no debe superar
    el saldo.
     Calcular el interés mensual de la cuenta y actualiza el saldo correspondiente.
     Extracto mensual: actualiza el saldo restándole la comisión mensual y calculando el interés mensual
    correspondiente (invoca el método anterior).
     Imprimir: muestra en pantalla los valores de los atributos*/
    public void consignar(float cantidad){
        saldo += cantidad;
    }
    public void retirar(float cantidad){
        if (cantidad <= saldo){
            saldo -= cantidad;
        }else {
            System.out.println("Saldo insuficiente, usted tiene en su cuenta $"+ getSaldo() + " disponible");
        }
    }
}
