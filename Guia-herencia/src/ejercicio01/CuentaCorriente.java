package ejercicio01;

public class CuentaCorriente extends Cuenta{
    
    private final double montoDescubierto;
    
    public CuentaCorriente(double saldoDescubierto){
        super();
        montoDescubierto=saldoDescubierto;
    }
    
    public void transferir(double dinero, Cuenta cuentaDestino,String motivo){
        if(dinero > 0 && this.saldo+montoDescubierto >= dinero)
        {
            cuentaDestino.saldo+=dinero;
            this.saldo-=dinero;
        }
        
        Transaccion trans = new Transaccion(motivo,dinero);    
        historial.add(trans);
    }
}