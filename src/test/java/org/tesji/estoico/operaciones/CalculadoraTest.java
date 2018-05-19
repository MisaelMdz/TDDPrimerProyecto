package org.tesji.estoico.operaciones;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Misael
 *Prueba de funcionalidad de una calculadora
 *debe de probar suma, resta y multiplicacion
 *con dos distintos
 */

public class CalculadoraTest {

	/*
	 * Prueba de sumar dos numeros
	 */
	@Test
	public void sumarTest() {
		Calculadora calculadora= new Calculadora();
		int resultado=calculadora.sumar(10,15);
		assertEquals(resultado, 25);
	}
	
	@Test
	public void restarTest() {
		Calculadora calculadora= new Calculadora();
		int resultado=calculadora.restar(20,5);
		assertEquals(resultado, 15);
	}
}
