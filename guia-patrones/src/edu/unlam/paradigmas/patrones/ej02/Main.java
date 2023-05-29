package edu.unlam.paradigmas.patrones.ej02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Tank obj1 = new Tank(111,0,0,100);
		
		obj1.moverse();
		obj1.atacar();
		
		obj1.modoAtaque();
		obj1.moverse();
		obj1.atacar();
		
		obj1.modoDefensa();
		obj1.moverse();
		obj1.atacar();
		
		

	}

}
