package com.cenfotec.patrones.logica;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProcesadorRomanoTest {

	@Test
	public void pruebaUno() {
		ProcesadorRomano PR = new ProcesadorRomano();
		assertEquals("LX", PR.logicaRomana("LX"));
	}

}
