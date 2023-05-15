package Ejercicio02;

public class MainOrquesta {

	public static void main(String[] args) {
		InstrumentoCuerda insCuerda = new InstrumentoCuerda("violin","violin nuevo");
		InstrumentoCuerda insCuerda2 = new InstrumentoCuerda("guitarra","violin nuevo");
		InstrumentoViento insViento = new InstrumentoViento("flauta","flauta barata");
		InstrumentoPercusion insPer = new InstrumentoPercusion("Piano","piano nuevo");
		
		Orquesta orquesta = new Orquesta(insCuerda);
		orquesta.agregarInstrumento(insCuerda2);
		orquesta.agregarInstrumento(insViento);
		orquesta.agregarInstrumento(insPer);
		orquesta.agregarInstrumento(insCuerda);
		
		orquesta.tocarViento();
		
		
		
		

	}

}
