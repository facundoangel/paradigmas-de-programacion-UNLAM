package unlam.paradigmas.objetos.ej03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestCirculo {
	
	private static Circulo cir;
	

	@BeforeAll
	static void setUpBeforeClass()  {
		cir = new Circulo(4);
		
	}

	@Test
	void testInicializacion() {
		cir.setRadio(4);
		
		double perimetro = 2 * Math.PI * 4;
		double area = Math.PI * 16;
		double diametro = 4 * 2;
		
		
		Assert.assertEquals(perimetro,cir.getPerimetro(),00.1);
		Assert.assertEquals(area,cir.getArea(),00.1);
		Assert.assertEquals(diametro,cir.getDiametro(),00.1);
		
	}
	
	@Test
	void testCambioDiametro() {
		cir.setDiametro(8);
		
		
		double radio = 4;
		double perimetro = 2 * Math.PI * radio;
		double area = Math.PI * 16;
		
		
		
		Assert.assertEquals(perimetro,cir.getPerimetro(),00.1);
		Assert.assertEquals(area,cir.getArea(),00.1);
		Assert.assertEquals(radio,cir.getRadio(),00.1);
		
	}
	
	@Test
	void testCambioPerimetro() {
		cir.setPerimetro(8*Math.PI);
		
		
		double radio = 4;
		double diametro = radio * 2;
		double area = Math.PI * 16;
		
		
		
		Assert.assertEquals(diametro,cir.getDiametro(),00.1);
		Assert.assertEquals(area,cir.getArea(),00.1);
		Assert.assertEquals(radio,cir.getRadio(),00.1);
		
	}
	
	
	@Test
	void testCambioArea() {
		cir.setArea(Math.PI * 16);
		
		
		double radio = 4;
		double perimetro = 2 * Math.PI * radio;
		double diametro = radio * 2;
	
		
		
		
		Assert.assertEquals(diametro,cir.getDiametro(),00.1);
		Assert.assertEquals(perimetro,cir.getPerimetro(),00.1);
		Assert.assertEquals(radio,cir.getRadio(),00.1);
		
	}

}
