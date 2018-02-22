package com.cenfotec.patrones.logica;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cenfotec.patrones.KataExamenApplication;

public class ProcesadorRomanoTest {

	@Test
	public void pruebaUno() {
		ProcesadorRomano PR = new ProcesadorRomano();
		assertEquals(60, PR.logicaRomanosaNumeros("LX"));
	}
	
	@Test
	public void pruebaDos() {
		ProcesadorRomano PR = new ProcesadorRomano();
		assertEquals(16, PR.logicaRomanosaNumeros("XVI"));
	}
	
	@Test
	public void pruebaTres() {
		ProcesadorRomano PR = new ProcesadorRomano();
		assertEquals(8, PR.logicaRomanosaNumeros("VIII"));
	}
	
	@Test
	public void pruebaCuatro() {
		ProcesadorRomano PR = new ProcesadorRomano();
		assertEquals(21, PR.logicaRomanosaNumeros("XXI"));
	}
	
	@Test
	public void pruebaCinco() {
		ProcesadorRomano PR = new ProcesadorRomano();
		assertEquals(101, PR.logicaRomanosaNumeros("CI"));
	}

	@Test
	public void pruebaSeis() {
		ProcesadorRomano PR = new ProcesadorRomano();
		assertEquals(161, PR.logicaRomanosaNumeros("CLXI"));
	}


}
