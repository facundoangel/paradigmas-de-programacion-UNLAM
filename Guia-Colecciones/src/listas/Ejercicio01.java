package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Ejercicio01 {
	
	
	public static Paquete BuscarPaquete(ArrayList<Paquete> paquetes,int nro){
		Paquete paqBuscado = null;
		
		for(Paquete paq : paquetes)
			if(paq.getNroSeguimiento()==nro)
				paqBuscado = paq;
		
		return paqBuscado;
	}
	
	public static ArrayList<Paquete> buscarPaquetesMayoresAPeso(ArrayList<Paquete> paquetes,double peso){
		ArrayList<Paquete> resultado = new ArrayList<Paquete>();
		
		
		for(Paquete paq : paquetes)
			if(paq.getPeso()>=peso)
				resultado.add(paq);
		
		return resultado;
	}

	public static void main(String[] args) {

		Paquete[] listaPaquetes = new Paquete[] { new Paquete(123, "alsina 2323", 45.80),
				new Paquete(124, "alsina 2323", 25.80), new Paquete(125, "Peron 2323", 43.20),
				new Paquete(126, "Castro Barro 211", 65.80), };

		ArrayList<Paquete> paquetes = new ArrayList<Paquete>(Arrays.asList(listaPaquetes));

		// paquete Prueba
		Paquete paquetePrueba = new Paquete(450, "florencio varela 4512", 60);

		// 1. Agregar un nuevo paquete al registro.
		paquetes.add(paquetePrueba);
		
		
		//2. Buscar un paquete por número de seguimiento.
		System.out.println("=======BUSQUEDA DE UN PAQUETE ESPECIFICO=======");
		System.out.println(BuscarPaquete(paquetes,124));
		
		//3. Mostrar la lista de paquetes que superan un peso determinado.
		double pesoBuscado = 40;
		System.out.println("=======BUSQUEDA DE PAQUETES MAYORES " + pesoBuscado + "=======");
		for(Paquete paq : buscarPaquetesMayoresAPeso(paquetes,pesoBuscado))
			System.out.println(paq);
		
		
		

	}

}
