package Ejercicio02;

public class Lustrador {
	public void lustrarInstrumento(Instrumento ins)
	{
		String tipoInstrumento = ins.getClass().getSimpleName();
		if(tipoInstrumento.equals("InstrumentoPercusion") 
		|| tipoInstrumento.equals("InstrumentoViento"))
			System.out.println("Se lustró el instrumento: " + ins );
		else
			System.out.println("El instrumento " + ins + " no se puede lustrar");
	}
}
