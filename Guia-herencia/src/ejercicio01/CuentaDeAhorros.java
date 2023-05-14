package ejercicio01;

public class CuentaDeAhorros extends Cuenta{
    
    private double saldoSecundario;
    
    public CuentaDeAhorros(double saldoSecundario){
        super();
        this.saldoSecundario = saldoSecundario;
    }
    
    public void protegerSaldo(double dinero){
        if(dinero > 0 && this.saldo >= dinero)
        {
            saldoSecundario+=dinero;
            this.saldo-=dinero;
        }
    }
    
    
    public void reintegroSaldo(){
        this.saldo+=this.saldoSecundario;
        saldoSecundario=0;
    }
    
}