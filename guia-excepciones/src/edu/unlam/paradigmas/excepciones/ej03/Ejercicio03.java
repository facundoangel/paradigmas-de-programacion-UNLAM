package edu.unlam.paradigmas.excepciones.ej03;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) throws DivisionPorCeroRunTimeException{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese numero 1: ");
		int num1 = scanner.nextInt();

		System.out.println("Ingrese numero 2: ");
		int num2 = scanner.nextInt();
		
		
		try {
			System.out.println("Resultado: " + num1 / num2);
		}catch(RuntimeException e) {
			if(num2==0)
				throw new DivisionPorCeroRunTimeException("El denominador no puede ser cero");
			
			e.printStackTrace();
		}
	}
}
