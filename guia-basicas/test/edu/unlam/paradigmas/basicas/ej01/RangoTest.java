package edu.unlam.paradigmas.basicas.ej01;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RangoTest {

	

	@Test
	void numeroEnRango() {
		Rango rango1 = Rango.crearIntervaloAbierto(1, 10);
		Rango rango2 = Rango.crearIntervaloCerrado(1, 10);
		Rango rango3 = Rango.crearIntervaloAbiertoCerrado(1, 10);
		
		Assert.assertTrue(rango1.numeroEnRango(5));
		Assert.assertTrue(rango2.numeroEnRango(10));
		Assert.assertTrue(!rango3.numeroEnRango(1));
	}
	
	@Test
	void rangoEnRango() {
		Rango rango1 = Rango.crearIntervaloCerrado(1, 10);		
		Rango rango2 = Rango.crearIntervaloAbierto(1, 10);
		Rango rango3 = Rango.crearIntervaloAbierto(-10, 10);
		Rango rango4 = Rango.crearIntervaloAbierto(-100, -70);
		Rango rango5 = Rango.crearIntervaloAbierto(800, 10_000);

		
		Assert.assertTrue(rango1.rangoEnRango(rango2));
		Assert.assertTrue(!rango2.rangoEnRango(rango1));
		Assert.assertTrue(!rango2.rangoEnRango(rango3));
		Assert.assertTrue(!rango1.rangoEnRango(rango3));
		Assert.assertTrue("rango5 dentro del rango 1", !rango1.rangoEnRango(rango4));
		Assert.assertTrue("rango4 dentro del rango 1", !rango1.rangoEnRango(rango5));
	}
	
	@Test
	void intersecciones() {

		Rango RangoTest = Rango.crearIntervaloAbiertoCerrado(1, 100);
		
		
		Rango rango1 = Rango.crearIntervaloCerradoAbierto(1, 100);
		Rango rango2 = Rango.crearIntervaloAbierto(100, 200);
		Rango rango3 = Rango.crearIntervaloCerrado(50, 300);
		
		Rango esperado1 = Rango.crearIntervaloAbierto(1, 100);
		Rango esperado2 = Rango.crearIntervaloAbierto(0, 0);
		Rango esperado3 = Rango.crearIntervaloCerrado(50, 100);
		
		Assert.assertEquals(esperado1,RangoTest.interseccion(rango1));
		Assert.assertEquals(esperado2,RangoTest.interseccion(rango2));
		Assert.assertEquals(esperado3,RangoTest.interseccion(rango3));
		
		Assert.assertTrue("no hay interseccion, cuando deberia haber",RangoTest.hayInterseccion(rango1));
		Assert.assertTrue("no hay interseccion consigo mismo",RangoTest.hayInterseccion(RangoTest));
		Assert.assertTrue("hay intersección cuando no debería",RangoTest.hayInterseccion(rango2));
	}

}
