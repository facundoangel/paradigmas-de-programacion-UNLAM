package listas;

public class Paquete {
	private int nroSeguimiento;
	private String DireccionOrigen;
	private double peso;
	
	public Paquete(int numero, String direccion, double peso) {
		this.nroSeguimiento=numero;
		this.DireccionOrigen=direccion;
		this.peso=peso;
	}

	public int getNroSeguimiento() {
		return nroSeguimiento;
	}

	public double getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "Paquete [nroSeguimiento=" + nroSeguimiento + ", peso=" + peso + "]";
	}
	
	
	
	
}
