package edu.unlam.paradigmas.patrones.ej01.figuras;

public class Triangulo extends Figura {

	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	
	
	
	
	@Override
	public double obtenerDimensiones() {
		
		return base*altura/2;
	}

}
