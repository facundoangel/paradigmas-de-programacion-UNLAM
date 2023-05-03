package edu.unlam.paradigmas.entradasalida.ej01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestEj01 {

	private static double[] esperado01;
	private static double[] esperado02;
	
	@BeforeAll
	static void setUpBeforeClass() {
		Archivo arc01 = new Archivo("esperado01","casos-pruebas/esperado/ej01/",".out");
		Archivo arc02 = new Archivo("esperado02","casos-pruebas/esperado/ej01/",".out");
		esperado01 = arc01.leerArchivo();
		esperado02 = arc02.leerArchivo();
	}

	@Test
	void caso01() {
		Archivo arc = new Archivo("casoTest01","casos-pruebas/esperado/ej01/",".in");
		Ejercicio01 ej = new Ejercicio01();
		
		double[] datosingresados = arc.leerArchivo();
		double[] datosReales = ej.resolver(datosingresados);
		
		Assert.assertArrayEquals(esperado01, datosReales, .0001);
	}
	
	@Test
	void caso02() {
		Archivo arc = new Archivo("casoTest02","casos-pruebas/esperado/ej01/",".in");
		Ejercicio01 ej = new Ejercicio01();
		
		double[] datosingresados = arc.leerArchivo();
		double[] datosReales = ej.resolver(datosingresados);
		
		Assert.assertArrayEquals(esperado02, datosReales, .0001);
	}

}
