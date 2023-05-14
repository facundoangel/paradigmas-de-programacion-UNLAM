package ejercicio01;

public class TarjetaDebito {

	private Cuenta cuenta;
	
	public TarjetaDebito(double saldoCuenta) {
		this.cuenta = new Cuenta();
		this.cuenta.depositar(saldoCuenta, "Saldo inicial");
	}
	
	public void compra(double monto, Cuenta destinatario) {
		this.cuenta.transferir(monto, destinatario, "compra");
	}
	
}
