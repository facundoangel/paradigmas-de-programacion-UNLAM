package edu.unlam.paradigmas.entradasalida.ej02;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ej02 {



	@Test
	void test() {
		
		
		Archivo02 arc = new Archivo02("casoTest","casos-pruebas/esperado/ej02/",".in");
		int[] datosReales = arc.leerArchivo();
		int[] datosEsperados = new int[] {9,1,4};
		
		Assert.assertArrayEquals(datosReales, datosEsperados);
	}

}
