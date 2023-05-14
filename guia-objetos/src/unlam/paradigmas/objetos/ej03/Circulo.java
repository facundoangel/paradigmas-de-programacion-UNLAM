package unlam.paradigmas.objetos.ej03;

public class Circulo {
	


	private double radio;
	private double perimetro;
	private double area;
	private double diametro;
	
	private void actualizarCirculo(double radio)
	{
		this.radio=radio;
		this.perimetro=2*Math.PI*this.radio;
		this.area=Math.PI*Math.pow(this.radio, 2);
		this.diametro=2*this.radio;
	}

	public Circulo(double radio) {
		this.radio=radio;
		this.perimetro=2*Math.PI*this.radio;
		this.area=Math.PI*Math.pow(this.radio, 2);
		this.diametro=2*this.radio;
	}
	
	public double getRadio() {
		return this.radio;
	}

	public void setRadio(double radio) {
		
		this.actualizarCirculo(radio);
	}

	public double getPerimetro() {
		return this.perimetro;
	}

	public void setPerimetro(double perimetro) {
		double radio = perimetro / (2 * Math.PI);
		this.actualizarCirculo(radio);
	}

	public double getArea() {
		return this.area;
	}

	public void setArea(double area) {
		double radio = Math.sqrt(area / Math.PI); 
		this.actualizarCirculo(radio);
	}

	public double getDiametro() {
		return this.diametro;
	}

	public void setDiametro(double diametro) {
		double radio = diametro / 2;
		this.actualizarCirculo(radio);
	}
}
