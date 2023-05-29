package edu.unlam.paradigmas.patrones.ej02;

public class TankModeSiegeState implements TankState {

	@Override
	public void atacar() {
		System.out.println("Atacar en modo Asedio");
		
	}

	@Override
	public void moverse() {
		System.out.println("Moverse en modo Asedio");
		
	}

}
