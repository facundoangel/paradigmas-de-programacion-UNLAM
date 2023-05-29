package edu.unlam.paradigmas.patrones.ej02;

public class TankModeTankState implements TankState {

	@Override
	public void atacar() {
		System.out.println("Atacar en modo tanque");
		
	}

	@Override
	public void moverse() {
		System.out.println("Moverse en modo Tanque");
		
	}

}
