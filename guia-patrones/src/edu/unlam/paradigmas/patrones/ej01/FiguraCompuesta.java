package edu.unlam.paradigmas.patrones.ej01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiguraCompuesta extends Figura{
	protected List <Figura> children = new ArrayList<>();
	String color;
	public FiguraCompuesta(String color, Figura ... figuras)
	{
		super(0, 0);
		add(figuras);
	}
	
	public void add(Figura... components) {
        children.addAll(Arrays.asList(components));
    }
	
	@Override
	double getArea()
	{
		double areaTotal = 0;
		for(Figura f : children)
		{
			areaTotal += f.getArea();
		}
		return areaTotal;
	}
}
