package test;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.paradigmas.patrones.ej01.Circulo;
import edu.unlam.paradigmas.patrones.ej01.Cuadrado;
import edu.unlam.paradigmas.patrones.ej01.Figura;
import edu.unlam.paradigmas.patrones.ej01.FiguraCompuesta;

public class casosDePrueba {
	
	@Test
	public void testObtPomos()
	{
		Figura cuad1 = new Cuadrado(11, 4, 5);
		FiguraCompuesta cuad = new FiguraCompuesta(
				"VERDE", cuad1
		);
		//11×11÷100=1,21 osea 2
		Assert.assertEquals(cuad.calcularTotalPomos(), 2);
	}
	@Test
	public void testObtPomosCompUnica() {
		Figura cuad1 = new Cuadrado(4, 4, 5); // 5
		Figura cir = new Circulo(3, 2, 1); // 
		Figura cuad2 = new Cuadrado(5, 5, 5);
		FiguraCompuesta figuras = new FiguraCompuesta(
				"VERDE", cuad1,
						cir,
						cuad2
		);
		// (16+9×3,14+25)÷100 = 0,69 = 1 redondeado arriba
		Assert.assertEquals(figuras.calcularTotalPomos(), 1);
		
	}
	@Test
	public void testObtPomosCompVar()
	{
		Figura cuad1 = new Cuadrado(5, 4, 5); // 5
		Figura cir = new Circulo(4, 2, 1); // 
		Figura cuad2 = new Cuadrado(3, 5, 5);
		
		//(25+16×3,14+9)÷100=0,89=1
		FiguraCompuesta figuras1 = new FiguraCompuesta(
				"VERDE", cuad1,
						cir,
						cuad2
		);
		//figuras 1 se queda en verde aunque la nueva fi
		//
		
		
		//(25+(84,24)+9)/100=2
		
		FiguraCompuesta figuras2 = new FiguraCompuesta(
				"ROJO",cuad1, figuras1, cuad2
		);
		/*
		//(25+9+9+5)÷10=5
		FiguraCompuesta figuras3 = new FiguraCompuesta(
				"AZUL", cuad1, figuras1, cuad2, figuras2
		);*/
		Assert.assertEquals(figuras2.calcularTotalPomos(), 2);
		
	}
}
