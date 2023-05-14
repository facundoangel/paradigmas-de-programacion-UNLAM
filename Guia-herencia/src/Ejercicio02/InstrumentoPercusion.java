package Ejercicio02;

public class InstrumentoPercusion extends Instrumento {
	public InstrumentoPercusion(String nombre, String descripcion) {
		super(nombre, descripcion);
	}

	public void tocar() {
		System.out.println("tocando instrumento de Percusión: " + this.nombre);
	}
}
