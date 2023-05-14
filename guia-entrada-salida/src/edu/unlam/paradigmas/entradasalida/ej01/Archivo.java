package edu.unlam.paradigmas.entradasalida.ej01;


import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Archivo {

	private String nombre;
	private String ruta;
	private String extension;

	public Archivo(String nombre) {
		this.nombre = nombre;
		this.ruta=this.extension="";
	}
	
	public Archivo(String nombre, String ruta, String extension) {
		this.nombre = nombre;
		this.ruta = ruta;
		this.extension=extension;
	}

	public double[] leerArchivo() {

		Scanner scanner = null;
		double[] datos = null;

		try {
			File file = new File((this.ruta.length() > 0 ? 
					this.ruta : "casos-pruebas/in/") + this.nombre + 
					(this.extension.length() > 0 ?
					this.extension : ".in"));
			scanner = new Scanner(file);
			scanner.useLocale(Locale.ENGLISH);

			int cantReg = scanner.nextInt();
			datos = new double[cantReg];

			for (int i = 0; i < cantReg; i++) {
				datos[i] = scanner.nextFloat();
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			scanner.close();
		}

		return datos;
	}

	public void escribirArchivo(double[] datos) {
		FileWriter file = null;
		PrintWriter pw = null;

		try {
			file = new FileWriter("casos-pruebas/out/" + this.nombre + ".out");
			pw = new PrintWriter(file);

			pw.println(datos.length);

			for (int i = 0; i < datos.length; i++)
				pw.println((int)datos[i]);
			System.out.println("Archivo generado");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
