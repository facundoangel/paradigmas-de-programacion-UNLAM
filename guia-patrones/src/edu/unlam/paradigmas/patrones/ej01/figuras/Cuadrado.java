package edu.unlam.paradigmas.patrones.ej01.figuras;

public class Cuadrado extends Figura {

	private double lado;

	public Cuadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double obtenerDimensiones() {

		return Math.pow(lado, 2);
	}

}
