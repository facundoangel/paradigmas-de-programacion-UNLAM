package Ejercicio02;

public abstract class Instrumento {
	protected String nombre;
	protected String descripcion;
	
	public Instrumento(String nombre, String descripcion) {
		this.nombre=nombre;
		this.descripcion=descripcion;
	}
	
	abstract public void tocar();
	
	@Override
	public String toString() {
		return this.nombre;
	}
}
