package claseHerencia;

public class Bicicleta {

	private  int cPaquetes;
	private  double ccKg;
	private  double cvCm3;
	private  double recorridoM;
	
	public Bicicleta(){
		this.cPaquetes=1;
		this.ccKg = 10;
		this.cvCm3 = 50;
		this.recorridoM = 1000;
				
	}
	
	
	public boolean puedoLlevar(int cPaquetes,double kg, double cv, double recorrido){
		return cPaquetes <= this.cPaquetes && kg <= this.ccKg && cv <= this.cvCm3 && recorrido <= this.recorridoM;
	}
	
	public boolean puedoLlevarUnPaquete(double kg, double cv, double recorrido)
	{
		if(this.ccKg - kg > 0 && this.cvCm3-cv>0 && this.recorridoM-recorrido>0)
		{
			this.ccKg-=kg;
			this.cvCm3-=cv;
			this.recorridoM-=recorrido;
			this.cPaquetes-=1;
			return true;
		}
		return false;
			
	}
	
	
	
}
