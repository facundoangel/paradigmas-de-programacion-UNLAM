package edu.unlam.paradigmas.patrones.ej01;
import java.util.ArrayList;

import edu.unlam.paradigmas.patrones.ej01.figuras.Figura;

public class ConjuntoFiguras {

	private ArrayList<Figura> figuras;
	private String color;
	
	
	public ConjuntoFiguras(String color) {
		this.figuras = new ArrayList<Figura>();
		this.color=color;
	}
	
	public ConjuntoFiguras(ArrayList<Figura> figuras,String color) {
		this.figuras=figuras;
		this.color=color;
	}
	
	public double obtenerAreas() {
		double totalAreas=0;
		
		for(Figura fig : this.figuras) {
			totalAreas+=fig.obtenerDimensiones();
		}
		
		return totalAreas;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void agregar(Figura figura) {
		this.figuras.add(figura);
	}
	
}
