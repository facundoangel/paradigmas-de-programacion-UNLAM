package ejercicio01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaccion{
    
    private String motivo;
    private double monto;
    private LocalDateTime fecha;
    
    public Transaccion(String motivo, double monto){
        this.motivo = motivo;
        this.monto = monto;
        fecha = LocalDateTime.now();
    }
    
    
    @Override
    public String toString(){
        
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        return "[Transacción] Motivo: " + this.motivo + " Monto: " + this.monto + " Fecha: " + fecha.format(formateador);
    }
    
}