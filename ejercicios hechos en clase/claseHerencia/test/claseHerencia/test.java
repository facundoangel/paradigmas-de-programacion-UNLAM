package claseHerencia;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void testBicicleta() {
		Bicicleta bici = new Bicicleta();
		
		assertTrue(bici.puedoLlevarUnPaquete(5, 20, 40));
		assertTrue(!bici.puedoLlevarUnPaquete(5, 20, 800));
		//assertTrue(bici.puedoLlevarUnPaquete(5, 20, 200));
			
	}
	
	@Test
	public void testMoto() {
		Moto moto = new Moto();
		
		assertTrue(moto.puedoLlevarUnPaquete(5, 20, 3900));
		assertTrue(moto.puedoLlevarUnPaquete(5, 20, 1000));
		//assertTrue(bici.puedoLlevarUnPaquete(5, 20, 200));
		
	}

	@Test
	public void testCamioneta() {
		Camioneta moto = new Camioneta();
		
		assertTrue(moto.puedoLlevarUnPaquete(5, 20, 3900,false));
		assertTrue(!moto.puedoLlevarUnPaquete(5, 20, 1000,true));
		//assertTrue(bici.puedoLlevarUnPaquete(5, 20, 200));
		
	}
}
