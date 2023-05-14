package unlam.paradigmas.objetos.ej02;



import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestPunto {
	
	private static Punto punto;

	@BeforeAll
	static void setUpBeforeClass()  {
		punto = new Punto(5,6);
	}

	@Test
	void testInicializacion() {
		
		punto.cambiarX(5);
		punto.cambiarY(6);

		Assert.assertEquals(5,punto.obtenerX(),0);
		Assert.assertEquals(6,punto.obtenerY(),0);
	}
	
	
	@Test
	void testCambioDeCoordenadas() {
		
		punto.cambiarX(8);
		punto.cambiarY(9);
		
		
		Assert.assertEquals(8,punto.obtenerX(),0);
		Assert.assertEquals(9,punto.obtenerY(),0);
	}
	
	@Test
	void testBooleanos() {
		
		punto.cambiarX(0);
		punto.cambiarY(0);
		
		
		Assert.assertTrue(punto.estaSobreEjeX());
		Assert.assertTrue(punto.estaSobreEjeY());
		Assert.assertTrue(punto.esElOrigen());
	}
	
	@Test
	void testDistancias() {
		
		punto.cambiarX(2);
		punto.cambiarY(2);
		
		Punto punto2 = new Punto(3,3);
		
		
		Assert.assertEquals(Math.sqrt(8),punto.distanciaAlOrigen(),0);
		Assert.assertEquals(1.4142135623731,punto.distanciaAotroPunto(punto2),0.1);
	}

}
