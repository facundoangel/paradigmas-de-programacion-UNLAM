package Ejercicio02;

public class InstrumentoViento extends Instrumento{
	public InstrumentoViento(String nombre, String descripcion) {
		super(nombre, descripcion);
	}

	public void tocar() {
		System.out.println("tocando instrumento de Viento: " + this.nombre);
	}
}
