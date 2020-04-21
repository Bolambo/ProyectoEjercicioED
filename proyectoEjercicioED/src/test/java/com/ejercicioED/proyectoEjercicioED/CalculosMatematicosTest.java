package com.ejercicioED.proyectoEjercicioED;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CalculosMatematicosTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@ParameterizedTest
	@CsvSource(value = { "1,1,1", "2,2,4", "2,-1,0.5", "2,10,1024" })
	void testPotencia(int base, int exponente, double resultadoEsperado) {
		assertEquals(resultadoEsperado, CalculosMatematicos.potencia(base, exponente));
	}

	@ParameterizedTest
	@CsvSource(value = { "2,2", "4,24", "-4,-1", "50,-1"})
	void testFactorial(int numero, int resultadoEsperado) {
		assertEquals(resultadoEsperado, CalculosMatematicos.factorial(numero));;
	}

	@ParameterizedTest
	@ValueSource(ints = {2,3,11,199})
	void testEsPrimo(int numero) {
		assertTrue(CalculosMatematicos.esPrimo(numero));;
	}
	
	@ParameterizedTest
	@ValueSource(ints = {4,9,69,121})
	void testEsNoPrimo(int numero) {
		assertFalse(CalculosMatematicos.esPrimo(numero));;
	}

}
