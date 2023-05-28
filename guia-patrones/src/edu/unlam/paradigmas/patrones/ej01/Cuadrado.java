package edu.unlam.paradigmas.patrones.ej01;

public class Cuadrado extends Figura{
	private double lado;
	public Cuadrado(double lado, double x, double y)
	{
		super(x, y);
		this.lado = lado;
	}
	@Override
	double getArea()
	{
		return lado * lado;
	}
}
