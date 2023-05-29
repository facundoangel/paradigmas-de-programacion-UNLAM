package edu.unlam.paradigmas.patrones.ej02;

public abstract class TankState {
	
	protected Tank tanque;
	
	public TankState(Tank t)
	{
		//porque no un new Tank(t)
		tanque=t;
	}
	
	public abstract String atacar();
	public abstract String moverse();
	

}
