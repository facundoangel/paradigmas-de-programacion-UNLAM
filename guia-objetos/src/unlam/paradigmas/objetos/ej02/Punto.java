package unlam.paradigmas.objetos.ej02;

public class Punto {
	
	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x=x;
		this.y=y;
	}
	// completar

	public double obtenerX() {
	
		return this.x;
	}

	public double obtenerY() {
		
		return this.y;
	}

	public void cambiarX(double x) {
		this.x=x;
		
	}

	public void cambiarY(double y) {
		this.y=y;
		
	}

	public boolean estaSobreEjeX() {
		
		return this.x==0;
	}

	public boolean estaSobreEjeY() {
	
		return this.y==0;
	}

	public boolean esElOrigen() {
		
		return this.x==0 && this.y==0;
	}

	public double distanciaAlOrigen() {
		
		double componenteX = Math.pow(this.x, 2);
		double componenteY = Math.pow(this.y, 2);
		
		return Math.sqrt(componenteX +componenteY);
	}

	public double distanciaAotroPunto(Punto p) {
		
		double componenteX = Math.pow(Math.abs(this.x-p.x), 2);
		double componenteY = Math.pow(Math.abs(this.x-p.x), 2);
		
		return Math.sqrt(componenteX +componenteY);
		
		
	}
}
