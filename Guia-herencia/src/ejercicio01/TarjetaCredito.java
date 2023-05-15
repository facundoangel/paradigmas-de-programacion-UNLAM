package ejercicio01;


import java.util.ArrayList;


public class TarjetaCredito {
private Cuenta cuenta;
private ArrayList<Double> saldosAcredores;
private ArrayList<Cuenta> cuentas;
	
	public TarjetaCredito(double saldoCuenta) {
		this.cuenta = new Cuenta();
		this.cuenta.depositar(saldoCuenta, "Saldo inicial");
	}
	
	private double Deudatotal() {
		double resultado = 0;
		
		for(double deuda : this.saldosAcredores)
			resultado+=deuda;
		
		return resultado;
	}
	
	public void compra(double monto, Cuenta destinatario) {
		saldosAcredores.add( monto * (1 + 0.03));
		cuentas.add(destinatario);
	}
	
	public boolean debitarDeCuenta() {
		if(this.cuenta.consultarSaldo() >= this.Deudatotal()) {
			this.cuenta.transferir(saldosAcredores.remove(0), cuentas.remove(0), "saldo de cuenta");
			return true;
		}
		
		return false;
	}
}
