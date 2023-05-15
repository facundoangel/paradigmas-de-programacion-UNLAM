package edu.unlam.paradigmas.excepciones.ej05;

import  edu.unlam.paradigmas.excepciones.ej04.CuentaSinFondoException;


public class CajeroAutomaticoV2 {

	private int saldo;

	public CajeroAutomaticoV2(int dinero) {
		this.saldo = dinero;
	}

	public int mostrarSaldo() {
		return this.saldo;
	}

	public void retirarDinero(int movimiento) {
		try {

			if (this.saldo < movimiento)
				throw new CuentaSinFondoException("Saldo insuficiente");
			
			if(movimiento<0)
				throw new RetiroDeSaldosException("Saldo no puede ser Negativo");

			this.saldo -= movimiento;

			System.out.println("Saldo restante: " + this.saldo);

		} catch (CuentaSinFondoException e) {
			System.out.println("No podes retirar tanto dinero");
			e.printStackTrace();
		}
		catch (RetiroDeSaldosException e) {
			System.out.println("El monto del retiro debe ser positivo");
			e.printStackTrace();
		}
	}

}
