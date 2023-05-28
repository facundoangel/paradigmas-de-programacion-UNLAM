package edu.unlam.paradigmas.patrones.ej01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura cuad1 = new Cuadrado(21, 4, 5); // 5
		Figura cir = new Circulo(15, 2, 1); // 
		Figura cuad2 = new Cuadrado(20, 5, 5);
		FiguraCompuesta figuras = new FiguraCompuesta(
				"VERDE", cuad1,
						cir,
						cuad2
		);
		
		// notese que la suma del total de pomos requeridos para pintar
		// individualmente las figuras es mayor que las requeridas
		// para pintar todas las figuras, esto es debido a que
		// si se calcula individualmente, cada resultado se
		// redondea para arriba, y ese
		// numero termina haciendo una diferencia en el
		// resultado final. Esto es logico ya que
		// si se quiere pintar un conjunto de figuras, hay que
		// tener en cuenta las areas como un conjunto o una
		// suma tambien, para que no se desperdicie los pomos
		System.out.println("total pomos calculados individualmente");
		System.out.println(cuad1.calcularTotalPomos());
		System.out.println(cir.calcularTotalPomos());
		System.out.println(cuad2.calcularTotalPomos());
		
		System.out.println("total pomos calculados como conjunto");
		System.out.println(figuras.calcularTotalPomos());
	}

}
