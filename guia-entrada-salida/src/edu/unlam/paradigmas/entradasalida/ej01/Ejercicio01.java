package edu.unlam.paradigmas.entradasalida.ej01;

import java.util.Arrays;

public class Ejercicio01 {

	public static void main(String[] args) {

		Archivo arc1 = new Archivo("caso01");
		Archivo arc2 = new Archivo("caso02");
		
		double[] datos1 = arc1.leerArchivo();
		double[] datos2 = arc2.leerArchivo();
		
		
		double[] nuevosDatos1 = resolver(datos1);
		double[] nuevosDatos2 = resolver(datos2);
		

		arc1.escribirArchivo(nuevosDatos1);
		arc2.escribirArchivo(nuevosDatos2);
	}

	public static double[] resolver(double[] datos) {
		Arrays.sort(datos);

		// CUENTO CANTIDAD DE DATOS SIN REPETIR
		int cantNuevosDatos = 0;

		for (int i = 0; i < datos.length; i++)
			if (i < datos.length - 1 && datos[i] != datos[i + 1])
				cantNuevosDatos++;
			else if (i == datos.length - 1 && datos[i] != datos[i - 1])
				cantNuevosDatos++;

		// ASIGNO ESOS NUEVOS DATOS SIN REPETIR A UN NUEVO VECTOR
		double[] nuevosDatos = new double[cantNuevosDatos];
		int contPosicion = 0;

		for (int i = 0; i < datos.length; i++)
			if (i < datos.length - 1 && datos[i] != datos[i + 1]) {
				nuevosDatos[contPosicion] = datos[i];
				contPosicion++;
			} else if ((i == datos.length - 1) && (datos[i] != datos[i - 1]))
				nuevosDatos[contPosicion] = datos[i];
		
		
		return nuevosDatos;
	}
}
