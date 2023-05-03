package edu.unlam.paradigmas.entradasalida.ej02;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Archivo02 {

	private String nombre;
	private String ruta;
	private String extension;

	public Archivo02(String nombre) {
		this.nombre = nombre;
		this.ruta=this.extension="";
	}
	
	public Archivo02(String nombre, String ruta, String extension) {
		this.nombre = nombre;
		this.ruta = ruta;
		this.extension=extension;
	}

	public int[] leerArchivo() {
		
		File file = null;
		Scanner scanner = null;
		int[] resultado = null;


		try {
			file = new File((this.ruta.length()>0? this.ruta :"casos-pruebas/out/") 
					+ this.nombre + 
					(this.extension.length() > 0 ? this.extension : ".in"));
			scanner = new Scanner(file);
			scanner.useLocale(Locale.ENGLISH);

			int cantRegistros = scanner.nextInt();

			int elem = scanner.nextInt();
			int max,min,sumatoria, promedio;
			max=min=sumatoria=elem;
		

			for (int i = 1; i < cantRegistros; i++) {
				elem = scanner.nextInt();

				if (elem > max)
					max = elem;

				if (elem < min)
					min = elem;

				sumatoria += elem;
			}
			
			promedio=sumatoria/cantRegistros;

			System.out.printf(new StringBuilder()
					.append("+----------+-------+\n")
					.append("| Máximo   | %5d |\n")
					.append("+----------+-------+\n")
					.append("| Mínimo   | %5d |\n")
					.append("+----------+-------+\n")
					.append("| Promedio | %5d |\n")
					.append("+----------+-------+\n")
					.toString()
					, max, min, promedio);

			
			resultado =  new int[]{max,min,promedio};
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			scanner.close();
			
			
		}

		
		return resultado;
	}

	public void escribirArchivo() {
		FileWriter file = null;
		PrintWriter pw = null;

		try {
			file = new FileWriter("casos-pruebas/out/" + this.nombre + ".out");
			pw = new PrintWriter(file);

			int cantRegistros = (int) (Math.random() * 10_001 + 10_000);
			pw.println(cantRegistros);

			for (int i = 0; i < cantRegistros; i++)
				pw.println((int) (Math.random() * 12_001));

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}