package claseHerencia;

public class Encomienda {
	
	/*
	 * CC 10k
	 * CV 50 cm3
	 * recorrido < 1km
	 * conductor
	 * */
	
	private double carga;
	private double volumen;
	private double recorrido;
	private boolean quimicos;
	
	
	public Encomienda(double carga, double volumen, double recorrido,boolean quimicos){
		this.carga = carga;
		this.volumen = volumen;
		this.recorrido = recorrido;
		this.quimicos = quimicos;
	}
	
	
	public boolean sePuede()
	{
		if(this.carga<10 && this.volumen<50 && this.recorrido<1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
	
		

	}

}
