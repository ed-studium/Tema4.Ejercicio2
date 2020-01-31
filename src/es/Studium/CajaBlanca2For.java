package es.Studium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CajaBlanca2For {

	@Test
	void testCamino1() {
		String resultadoEsperado = "";
		String resultadoReal= Ejercicio2For.trianguloNumerico(0);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testCamino3() {
		String resultadoEsperado = "1\n";
		String resultadoReal= Ejercicio2For.trianguloNumerico(1);
		assertEquals(resultadoEsperado, resultadoReal);
	}
}
