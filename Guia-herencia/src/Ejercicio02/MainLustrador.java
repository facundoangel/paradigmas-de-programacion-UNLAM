package Ejercicio02;

public class MainLustrador {

	public static void main(String[] args) {
		InstrumentoCuerda insCuerda = new InstrumentoCuerda("violin","violin nuevo");
		InstrumentoViento insViento = new InstrumentoViento("flauta","flauta barata");
		InstrumentoPercusion insPer = new InstrumentoPercusion("Piano","piano nuevo");
		
		
		Lustrador lustrador = new Lustrador();
		
		lustrador.lustrarInstrumento(insCuerda);
		lustrador.lustrarInstrumento(insViento);
		lustrador.lustrarInstrumento(insPer);

	}

}
