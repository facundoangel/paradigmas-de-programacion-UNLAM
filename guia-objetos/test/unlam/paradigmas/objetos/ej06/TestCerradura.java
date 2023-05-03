package unlam.paradigmas.objetos.ej06;



import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCerradura {

	private Cerradura cerradura;
	@BeforeEach
	void setUp() {
		cerradura = new Cerradura(1234,2);
	}

	@Test
	void abrir() {
		
		
		cerradura.abrir(123);
		Assert.assertFalse(cerradura.estaAbierta());
		cerradura.abrir(1234);
		Assert.assertTrue(cerradura.estaAbierta());
	}
	
	@Test
	void cerrar() {
		
		
		cerradura.abrir(1234);
		Assert.assertTrue(cerradura.estaAbierta());
		cerradura.cerrar();
		Assert.assertFalse(cerradura.estaAbierta());
	}
	
	@Test
	void bloqueo() {
		
		
		cerradura.abrir(123);
		cerradura.abrir(123);
		Assert.assertTrue(cerradura.fueBloqueada());

	}
	
	@Test
	void contarIntentosFallidosYExitosos() {
		
		
		cerradura.abrir(1234);
		cerradura.cerrar();
		cerradura.abrir(1234);
		cerradura.abrir(123);


		Assert.assertEquals(2, cerradura.contarAperturasExitosas());
		Assert.assertEquals(1, cerradura.contarAperturasFallidas());

	}

}
