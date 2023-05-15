package edu.unlam.paradigmas.excepciones.ej05;

public class Ejercicio05 {
	public static void main(String[] args) {

		CajeroAutomaticoV2 cajero = new CajeroAutomaticoV2(900);

		// CASO QUE ARROJA EXCEPCIÓN POR MONTO SUPERIOR AL SALDO
		// cajero.retirarDinero(1000);

		// CASO QUE ARROJA EXCEPCIÓN POR MOVIMIENTO NEGATIVO
		// cajero.retirarDinero(-100);

		// CASO QUE FUNCIONA OK
		cajero.retirarDinero(100);
	}
}
