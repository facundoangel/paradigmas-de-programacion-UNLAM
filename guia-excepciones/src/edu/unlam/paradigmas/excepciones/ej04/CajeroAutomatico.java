package edu.unlam.paradigmas.excepciones.ej04;

public class CajeroAutomatico {
	
	private int saldo;
	
	public CajeroAutomatico(int dinero) {
		this.saldo = dinero;
	}
	
	public int mostrarSaldo() {
		return this.saldo;
	}
	
	public void retirarDinero(int movimiento) {
			try {
				
				if(this.saldo < movimiento)
					throw new CuentaSinFondoException("Saldo insuficiente");
				
				this.saldo -= movimiento;
				
				System.out.println("Saldo restante: " + this.saldo);
				
			}catch(CuentaSinFondoException e) {
				System.out.println("No podes retirar tanto dinero");
				e.printStackTrace();
			}
	}
	
}
