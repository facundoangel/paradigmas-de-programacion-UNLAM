package edu.unlam.paradigmas.patrones.ej02;

public class Ejercicio02 {
	public static void main(String[] args) {
		
		TankTerran tanque = new TankTerran();
		
		tanque.atacar();
		tanque.moverse();
		
		tanque.cambiarModoAsedio();
		
		tanque.atacar();
		tanque.moverse();
		
		tanque.cambiarModoTanque();
		
		tanque.atacar();
		tanque.moverse();
		
	}
}
