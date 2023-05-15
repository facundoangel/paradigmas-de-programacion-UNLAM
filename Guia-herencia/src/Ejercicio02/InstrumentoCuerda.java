package Ejercicio02;

public class InstrumentoCuerda extends Instrumento {

	public InstrumentoCuerda(String nombre, String descripcion) {
		super(nombre,descripcion);
	}
	
	public void tocar() {
		System.out.println("tocando instrumento de cuerda: " + this.nombre);
	}
	
}
