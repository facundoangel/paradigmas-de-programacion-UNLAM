package edu.unlam.paradigmas.patrones.ej01;
import edu.unlam.paradigmas.patrones.ej01.figuras.*;

public class Ejercicio01 {
	public static void main(String[] args) {
		Triangulo triangulo1 = new Triangulo(3,4);
		Triangulo triangulo2 = new Triangulo(6,8);
		
		Rectangulo rectangulo = new Rectangulo(4,9);
		
		Cuadrado cuadrado1 = new Cuadrado(3);
		Cuadrado cuadrado2 = new Cuadrado(8);
		
		Circulo circulo = new Circulo(2);
		
		
		ConjuntoFiguras con1 = new ConjuntoFiguras("rojo");
		con1.agregar(triangulo1);//12
		con1.agregar(rectangulo);//36
		con1.agregar(cuadrado1);//9
		con1.agregar(circulo);//12,56
		//total = 69,56
		
		ConjuntoFiguras con2 = new ConjuntoFiguras("azul");
		con2.agregar(triangulo2);//24
		con2.agregar(rectangulo);//36
		con2.agregar(cuadrado2);//64
		con2.agregar(circulo);//12,56
		// total =  136,56
		
		TareaFiguras tarea = new TareaFiguras();
		tarea.agregarConjunto(con1);
		tarea.agregarConjunto(con2);
		
		
		tarea.obtenerListadoMateriales();
		
		
		
		
	}
}
