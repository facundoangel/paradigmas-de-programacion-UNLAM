package edu.unlam.paradigmas.patrones.ej01;
import java.util.ArrayList;

public class TareaFiguras {
	
	private final double cantTemperaCm2 = 100;

	private ArrayList<ConjuntoFiguras> figurasADibujar;

	public TareaFiguras() {
		this.figurasADibujar = new ArrayList<ConjuntoFiguras>();
	}

	public TareaFiguras(ArrayList<ConjuntoFiguras> figurasADibujar) {
		this.figurasADibujar = figurasADibujar;
	}
	
	public void agregarConjunto(ConjuntoFiguras conjunto) {
		this.figurasADibujar.add(conjunto);
	}
	
	public void obtenerListadoMateriales() {
		
		System.out.println("==================Lista de Materiales=================");
		for(ConjuntoFiguras figs : this.figurasADibujar) {
			double areaTotal = figs.obtenerAreas();
			
			int cantPomos = (int) ( areaTotal / this.cantTemperaCm2)
					+ ((areaTotal%this.cantTemperaCm2==0)? 0 : 1);
			
			System.out.println(cantPomos + " de temperas de color " + figs.getColor());
			
		}
	}
}
