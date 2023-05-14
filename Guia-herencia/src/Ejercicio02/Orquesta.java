package Ejercicio02;

import java.util.ArrayList;

public class Orquesta {
	private ArrayList<Instrumento> instrumentos;
	
	public Orquesta(ArrayList<Instrumento> instrumentos)
	{
		this.instrumentos = instrumentos;
	}
	
	public Orquesta(Instrumento instrumento)
	{
		this.instrumentos = new ArrayList<Instrumento>();
		this.instrumentos.add(instrumento);
		
	}
	
	public void agregarInstrumento(Instrumento instrumento) {
		this.instrumentos.add(instrumento);
	}
	
	public void tocarTodos() {
		for(Instrumento ins : this.instrumentos) {
			ins.tocar();
		}
	}
	
	public void tocarCuerda() {
		for(Instrumento ins : this.instrumentos) {
			if(ins.getClass().getSimpleName().equals("InstrumentoCuerda"));
				ins.tocar();
		}
	}
	
	public void tocarViento() {
		for(Instrumento ins : this.instrumentos) {
			if(ins.getClass().getSimpleName().equals("InstrumentoViento"))
				ins.tocar();
		}
	}
	
	
	public void tocarPercusion() {
		for(Instrumento ins : this.instrumentos) {
			if(ins.getClass().getSimpleName().equals("InstrumentoPercusion"))
				ins.tocar();
		}
	}
}
