package ejercicio01;

import java.util.ArrayList;

public class Cuenta{
    
    public double saldo;
    protected ArrayList<Transaccion> historial = new ArrayList<Transaccion>();
    
    public Cuenta()
    {
        this.saldo = 0;
    }
    
    public void depositar(double dinero, String motivo){
        
        if(dinero>0)
            this.saldo+=dinero;
            
            
        Transaccion trans = new Transaccion(motivo,dinero);    
        historial.add(trans);
    }
    
    public void transferir(double dinero, Cuenta cuentaDestino, String motivo){
        if(dinero > 0 && this.saldo >= dinero)
        {
            cuentaDestino.saldo+=dinero;
            this.saldo-=dinero;
        }
        
        
        Transaccion trans = new Transaccion(motivo,dinero);    
        historial.add(trans);
    }
    
    public void mostrarHistorial(){
        for(Transaccion trans : this.historial){
            System.out.println(trans);
        }
    }
    
    public double consultarSaldo(){
        return this.saldo;
    }
    
    
}