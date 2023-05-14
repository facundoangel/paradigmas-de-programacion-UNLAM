package edu.unlam.paradigmas.entradasalida.ej03;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ej03 {

	private static int[] datosEsperados;

	@BeforeAll
	public static void setUp() {
		//LEO LA INFORMACIÓN DEL ARCHIVO esperado.out
		File file = null;
		Scanner scannerCont = null;
		Scanner scanner = null;

		try {
			file = new File("casos-pruebas/esperado/ej03/esperado.out");
			scannerCont = new Scanner(file);

			int cont=0;
			while(scannerCont.hasNext())
			{
				scannerCont.nextInt();
				cont++;
			}
			datosEsperados = new int[cont];
			
			
			
			scannerCont.close();
			scanner=new Scanner(file);
			for(int i=0;i<cont;i++)
				datosEsperados[i]=scanner.nextInt();
				

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}

	}

	@Test
	void test() {
		Archivo03 arc = new Archivo03("casoTest", "casos-pruebas/esperado/ej03/", ".in");
		Sumo[] sumos = arc.leerArchivo();
		Ejercicio03 ej = new Ejercicio03();

		
		int[] datosReales = ej.resolver(sumos);

		Assert.assertArrayEquals(datosEsperados, datosReales);
	}

}
