package edu.unlam.paradigmas.patrones.ej01.figuras;

public class Circulo extends Figura {
	
	private double radio;
	
	
	public Circulo(double radio) {
		this.radio=radio;
	}

	@Override
	public double obtenerDimensiones() {

		return Math.PI * Math.pow(radio, 2);
	}

}
