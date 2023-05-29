package edu.unlam.paradigmas.patrones.ej02;

public class TankModeSiegeState extends TankState {
	
	public TankModeSiegeState(Tank tanque) {
		super(tanque);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String moverse() //cambia a asedio
	{
		tanque.x-=2;
		return "Tanque movido a la posicion: " + 
				Integer.toString(tanque.x);
	}
	
	@Override
	public String atacar()
	{
		//no se puede modificar directamente el atributo del padre
		//para eso se deberia hacer un setter
		tanque.municion-=2;
		return "Tanque disparando, municion actual: " +
				Integer.toString(tanque.municion);
	}


}
