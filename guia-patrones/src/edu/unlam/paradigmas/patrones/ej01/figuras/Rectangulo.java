package edu.unlam.paradigmas.patrones.ej01.figuras;

public class Rectangulo extends Figura {

	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	
	
	
	
	@Override
	public double obtenerDimensiones() {
		
		return base*altura;
	}


}
