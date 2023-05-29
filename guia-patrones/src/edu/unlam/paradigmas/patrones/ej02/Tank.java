package edu.unlam.paradigmas.patrones.ej02;

public class Tank {
	
	protected int patente;
	protected int x;
	protected int y;
	protected int municion;
	TankState estado;
	
	public Tank(int p, int e, int i, int m)
	{
		this.patente = p;
		this.x=e;
		this.y=i;
		this.municion=m;
		this.estado=new TankModeSiegeState(this);
	}
	
	public void changeStateTo(TankState st)
	{
		this.estado = st;
	}
	public void modoAtaque()
	{
		this.estado = new TankModeTankState(this);
	}
	
	public void modoDefensa()
	{
		this.estado = new TankModeSiegeState(this);
	}
	
	public void moverse()
	{
		this.estado.moverse();
	}
	
	public void atacar()
	{
		this.estado.atacar();
	}
	

	
	

}
