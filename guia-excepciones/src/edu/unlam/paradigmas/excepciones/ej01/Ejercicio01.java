package edu.unlam.paradigmas.excepciones.ej01;


import java.util.Scanner;


public class Ejercicio01
{
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese numero 1: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Ingrese numero 2: ");
		int num2 = scanner.nextInt();
		
		try {
		    int resultado = num1 / num2;
		    
		    System.out.println("El resultado es: " + resultado);
		    
		} catch(ArithmeticException e) {
		    System.out.println("no se puede dividir por cero");
		    e.printStackTrace();
		}
		
	}
}

