package claseHerencia;

public class Moto {
	private  int cPaquetes;
	private  double ccKg;
	private  double cvCm3;
	private  double recorrido;
	
	public Moto(){
		this.cPaquetes=6;
		this.ccKg = 30;
		this.cvCm3 = 100;
		this.recorrido = 5000;
				
	}
	
	
	public boolean puedoLlevar(int cPaquetes,double kg, double cv, double recorrido){
		return cPaquetes <= this.cPaquetes && kg <= this.ccKg && cv <= this.cvCm3 && recorrido <= this.recorrido;
	}
	
	public boolean puedoLlevarUnPaquete(double kg, double cv, double recorrido)
	{
		if(this.ccKg - kg > 0 && this.cvCm3-cv>0 && this.recorrido-recorrido>0)
		{
			this.ccKg-=kg;
			this.cvCm3-=cv;
			this.recorrido-=recorrido;
			this.cPaquetes-=1;
			return true;
		}
		return false;
			
	}

}
