package com.cenfotec.patrones.logica;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cenfotec.patrones.KataExamenApplication;

public class ProcesadorRomanoTest {

	@Test
	public void pruebaUno() {
		ProcesadorRomano PR = new ProcesadorRomano();
		assertEquals(10, PR.logicaRomanosaNumeros("LX"));
	}

}
