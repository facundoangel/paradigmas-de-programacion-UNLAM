package edu.unlam.paradigmas.patrones.ej01;

public class Circulo extends Figura{
	private double rad;
	private static final double PI = 3.14;
	
	public Circulo(double rad, double x, double y)
	{
		super(x, y);
		this.rad = rad;
	}
	@Override
	double getArea()
	{
		return PI * rad * rad;
	}
}
