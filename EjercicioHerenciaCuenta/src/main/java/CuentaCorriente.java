public class CuentaCorriente extends Cuenta{
    private float sobregiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    @Override
    public void retirar(float cantidad){
        if (cantidad <= saldo){
            saldo -= cantidad;
            numeroRetiros++;
        }else {
            saldo = 0;
            sobregiro = (cantidad - saldo);
        }
    }
    @Override
    public void consignar(float cantidad){
        if (sobregiro > 0){
            if (cantidad - sobregiro < 0){
                sobregiro = 0;
                cantidad -= sobregiro;
            }else {
                sobregiro -= cantidad;
                cantidad -= sobregiro;
            }
        }
        saldo += cantidad;
        numeroConsignaciones ++;
    }
    @Override
    public void extractoMensual(){
        super.extractoMensual();
    }
}
