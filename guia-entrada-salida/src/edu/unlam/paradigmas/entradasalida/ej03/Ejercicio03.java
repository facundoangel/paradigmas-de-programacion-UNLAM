package edu.unlam.paradigmas.entradasalida.ej03;

public class Ejercicio03 {

	public static void main(String[] args) {
		Archivo03 arc = new Archivo03("sumo");
		Sumo[] sumos = arc.leerArchivo();
		
		int[] resultados = resolver(sumos);
				
		arc.escribirArchivo(resultados);
	}
	
	public static int[] resolver(Sumo[] sumos) {
		
		int[] resultados = new int[sumos.length];
		
		for(int i=0; i< sumos.length; i++)
			for(int j=0;j<sumos.length;j++)
				if(i!=j && sumos[i].dominaAContricante(sumos[j]))
					resultados[i]++;
		
		return resultados;
		
	}

}
