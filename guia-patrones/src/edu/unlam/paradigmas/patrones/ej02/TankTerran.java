package edu.unlam.paradigmas.patrones.ej02;

public class TankTerran {
	
	private TankState state;
	
	
	public TankTerran() {
		this.state = new TankModeTankState();
	}
	
	public void cambiarModoTanque() {
		this.state = new TankModeTankState();
	}
	
	public void cambiarModoAsedio() {
		this.state = new TankModeSiegeState();
	}
	
	public void atacar() {
		this.state.atacar();
	}
	
	public void moverse() {
		this.state.moverse();
	}
}
