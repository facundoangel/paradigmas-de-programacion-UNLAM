package unlam.paradigmas.objetos.ej05;

public class TarjetaBaja {

	private double saldo;
	private int cantViajesSubte;
	private int cantViajesColectivos;
	private int cantViajes;
	
	/**
	 * post: saldo de la Tarjeta en saldoInicial.
	 */
	public TarjetaBaja(double saldoInicial) {
		this.saldo=saldoInicial;
		
	}

	/**
	 * post: devuelve el saldo actual de la Tarjeta
	 */
	public double obtenerSaldo() {
		
		return this.saldo;
	}

	/**
	 * post: agrega el monto al saldo de la Tarjeta.
	 */
	public void cargar(double monto) {
		if(monto>0)
			this.saldo+=monto;
			
	}

	/**
	 * pre : saldo suficiente. post: utiliza 39.59 del saldo para un viaje en
	 * colectivo.
	 */
	public void pagarViajeEnColectivo() {
		if(this.saldo >= 39.59) {
			this.saldo-=39.59;
			this.cantViajes++;
			this.cantViajesColectivos++;
		}
	}

	/**
	 * pre : saldo suficiente. post: utiliza 34.50 del saldo para un viaje en subte.
	 */
	public void pagarViajeEnSubte() {
		if(this.saldo >= 34.50) {
			this.saldo-=34.50;
			this.cantViajes++;
			this.cantViajesSubte++;
		}
	}

	/**
	 * post: devuelve la cantidad de viajes realizados.
	 */
	public int contarViajes() {
		
		return this.cantViajes;
	}

	/**
	 * post: devuelve la cantidad de viajes en colectivo.
	 */
	public int contarViajesEnColectivo() {
		
		return this.cantViajesColectivos;
	}

	/**
	 * post: devuelve la cantidad de viajes en subte.
	 */
	public int contarViajesEnSubte() {
		
		
		return this.cantViajesSubte;
	}

}
