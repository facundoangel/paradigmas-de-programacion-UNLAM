package edu.unlam.paradigmas.excepciones.ej02;


import java.util.Scanner;
//import package.RaizNegativaException;


public class Ejercicio02{
    
    public static void main (String[] args) throws RaizNegativaException {
        
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese radicando: ");
		int num = scanner.nextInt();
		

		  try {
	            if(num<0)
	            	throw new RaizNegativaException("no podes calcular raiz de un numero negativo");
	            
	            System.out.println("Resultado: " + Math.sqrt(num));
	            
	        } catch(RaizNegativaException e) {
	            
	        	System.out.println("Utiliza con un número positivo por favor");
	        	e.printStackTrace();
	            //throw new RaizNegativaException("no podes calcular raiz de un numero negativo",e);
	        } 
        
    }
    
   
    
}