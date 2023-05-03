package unlam.paradigmas.objetos.ej01;



import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestNota {
	
	private static Nota nota;

	@BeforeAll
	static void setUpBeforeClass() {
		nota = new Nota(7);
	}


	
	@Test
	void testInicializacion() {
	
		
		Assert.assertEquals(7, nota.obtenerValor());

	}
	
	@Test
	void testRecuperar() {
	
	
		nota.recuperar(10);
		Assert.assertEquals(10, nota.obtenerValor());
	}

}
