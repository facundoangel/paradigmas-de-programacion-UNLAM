package unlam.paradigmas.objetos.ej05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestTarjetaBaja {
	

	@Test
	void viajeEnColectivo() {
		TarjetaBaja tarjeta = new TarjetaBaja(60);
		
		tarjeta.pagarViajeEnColectivo();
		tarjeta.pagarViajeEnColectivo();
		
		Assert.assertEquals(20.41,tarjeta.obtenerSaldo(),0.01);
		Assert.assertEquals(1,tarjeta.contarViajes());
		Assert.assertEquals(0,tarjeta.contarViajesEnSubte());
		Assert.assertEquals(1,tarjeta.contarViajesEnColectivo());
	}
	
	@Test
	void viajeEnSubte() {
		TarjetaBaja tarjeta = new TarjetaBaja(60);
		
		tarjeta.pagarViajeEnSubte();
		tarjeta.pagarViajeEnSubte();
		
		Assert.assertEquals(25.5,tarjeta.obtenerSaldo(),0.01);
		Assert.assertEquals(1,tarjeta.contarViajes());
		Assert.assertEquals(1,tarjeta.contarViajesEnSubte());
		Assert.assertEquals(0,tarjeta.contarViajesEnColectivo());
	}
	
	@Test
	void CargaSaldo() {
		TarjetaBaja tarjeta = new TarjetaBaja(20);
		
		tarjeta.cargar(20);
		Assert.assertEquals(40, tarjeta.obtenerSaldo(),0.01);
		tarjeta.cargar(-200);
		Assert.assertEquals(40, tarjeta.obtenerSaldo(),0.01);
	}

}
