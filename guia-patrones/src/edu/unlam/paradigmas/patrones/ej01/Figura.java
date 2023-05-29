package edu.unlam.paradigmas.patrones.ej01;

public abstract class Figura {
	private double x, y;
	public static final int CANTPOMOM2 = 100;
	//private String color
	
	public Figura(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	abstract double getArea(); //se lo delego a las hijas
	
	public int calcularTotalPomos()
	{
		double areaFigura = getArea();
		//al parsearlo como int trunca para abajo igual, como un math.floor
		return (int) areaFigura / CANTPOMOM2 + ((areaFigura % CANTPOMOM2 == 0) ? 0 : 1);
	}
	
}
