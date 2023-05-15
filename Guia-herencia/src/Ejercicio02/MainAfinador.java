package Ejercicio02;

public class MainAfinador {

	public static void main(String[] args) {
		
		InstrumentoPercusion insPer = new InstrumentoPercusion("Piano","piano nuevo");
		InstrumentoCuerda insCuerda = new InstrumentoCuerda("violin","violin nuevo");


		
		Afinador afinador = new Afinador();

		afinador.afinarManual(insPer);
		afinador.afinarManual(insCuerda);

	}

}
