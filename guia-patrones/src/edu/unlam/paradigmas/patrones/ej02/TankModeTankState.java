package edu.unlam.paradigmas.patrones.ej02;

public class TankModeTankState extends TankState{
	
	

	
	
	public TankModeTankState(Tank t) {
		super(t);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String moverse()
	{
		tanque.x+=1;
		return "Tanque movido a la posicion: " + 
				Integer.toString(tanque.x);
	}
	
	
	@Override
	public String atacar()
	{
		tanque.municion-=5;
		return "Tanque disparando, municion actual: " +
				Integer.toString(tanque.municion);
	}

}
