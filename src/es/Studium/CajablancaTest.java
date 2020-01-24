package es.Studium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CajaBlancaTest {

	@Test
	void testCamino1() {
		boolean resultadoEsperado = true;
		boolean resultadoReal= Ejercicio2.esParOImpar(2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testCamino2() {
		boolean resultadoEsperado = false;
		boolean resultadoReal= Ejercicio2.esParOImpar(1);
		assertEquals(resultadoEsperado, resultadoReal);
	}

}