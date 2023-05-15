package claseHerencia;

public class Camioneta {
	private  double ccKg;
	private  double cvCm3;
	private  double recorrido;
	
	public Camioneta(){
		this.ccKg = 15_000;
		this.cvCm3 = 2000;
		this.recorrido = 20000;	
	}
	
	
	public boolean puedoLlevarUnPaquete(double kg, double cv, double recorrido,boolean quimico)
	{
		if(this.ccKg - kg > 0 && this.cvCm3-cv>0 && this.recorrido-recorrido>0 && quimico==false)
		{
			this.ccKg-=kg;
			this.cvCm3-=cv;
			this.recorrido-=recorrido;
			return true;
		}
		return false;
			
	}
	

}
