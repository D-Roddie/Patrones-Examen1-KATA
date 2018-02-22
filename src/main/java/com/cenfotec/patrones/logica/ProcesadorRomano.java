package com.cenfotec.patrones.logica;

public class ProcesadorRomano {
	
	public int valoresRomanos (char valorRomano) {
		if(valorRomano == 'I') {
			return 1;
			}
		if (valorRomano == 'V') {
			return 5;
			}
		if(valorRomano == 'X') {
			return 10;
			}
		if (valorRomano == 'L') {
			return 50;
			}
		if(valorRomano == 'C') {
			return 100;
			}
		if(valorRomano == 'D') {
			return 500;
		}
		if(valorRomano == 'M') {
			return 1000;
		}
		return -1;	
	}

}
