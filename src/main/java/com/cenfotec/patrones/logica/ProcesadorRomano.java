package com.cenfotec.patrones.logica;

public class ProcesadorRomano {
	
	public int logicaRomanosaNumeros(String num_romano) {
		int romano = 0;
		for (int i = 0; i < num_romano.length(); i++) {	
			int letraUno = valoresRomanos((char) num_romano.length());
			if (i +1 < num_romano.length()){
				int letraDos = valoresRomanos(num_romano.charAt(i+1));
				
				if(letraUno >= letraDos){
					romano = romano + letraUno;
				} else {
					romano = romano + letraDos - letraUno;
					i ++;
				}
	
			} else {
				romano = romano + letraUno;
				i++;
			}
		}
		return romano;
	}
	
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
