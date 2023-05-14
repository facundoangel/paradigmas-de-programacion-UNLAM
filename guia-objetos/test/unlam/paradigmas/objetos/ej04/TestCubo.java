package unlam.paradigmas.objetos.ej04;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestCubo {
	
	private static Cubo cubo;

	@BeforeAll
	static void setUpBeforeClass() {
		cubo = new Cubo(2);
	}

	@Test
	void testLado() {
		cubo.cambiarLado(2);
		
		Assert.assertEquals(2, cubo.obtenerLado(),0.01);
		
		
		//testeo que no considere numeros negativos
		cubo.cambiarLado(-1);
		Assert.assertEquals(2, cubo.obtenerLado(),0.01);
	}
	
	@Test
	void testArea() {
		cubo.cambiarAreaCara(4);
		
		Assert.assertEquals(4, cubo.obtenerAreaCara(),0.01);
		Assert.assertEquals(2, cubo.obtenerLado(),0.01);
		
		//testeo que no considere numeros negativos
		cubo.cambiarAreaCara(-1);
		Assert.assertEquals(4, cubo.obtenerAreaCara(),0.01);
	}
	
	@Test
	void testVolumen() {
		cubo.cambiarVolumen(27);
		
		Assert.assertEquals(27, cubo.obtenerVolumen(),0.01);
		Assert.assertEquals(3, cubo.obtenerLado(),0.01);
		
		
		//testeo que no considere numeros negativos
		cubo.cambiarVolumen(-1);
		Assert.assertEquals(27, cubo.obtenerVolumen(),0.01);
	}

}
