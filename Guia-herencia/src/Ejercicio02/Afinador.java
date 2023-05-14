package Ejercicio02;

public class Afinador {
	public void afinarManual(Instrumento ins)
	{
		String tipoInstrumento = ins.getClass().getSimpleName();
		if(tipoInstrumento.equals("InstrumentoCuerda") 
		|| tipoInstrumento.equals("InstrumentoViento"))
			System.out.println("Se afino el instrumento: " + ins + " de manera manual");
		else
			System.out.println("El instrumento " + ins + " no se puede afinar");
	}
	
	public void afinarAutomatica(Instrumento ins)
	{
		String tipoInstrumento = ins.getClass().getSimpleName();
		if(tipoInstrumento.equals("InstrumentoCuerda") 
		|| tipoInstrumento.equals("InstrumentoViento"))
			System.out.println("Se afino el instrumento: " + ins + " de manera automática");
		else
			System.out.println("El instrumento " + ins + " no se puede afinar");
	}
}
