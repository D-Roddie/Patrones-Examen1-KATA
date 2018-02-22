package com.cenfotec.patrones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.*;
@SpringBootApplication
public class KataExamenApplication {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;
	
	public static void main(String[] args) {
		
	}
	
	public static void mostrarMenu() throws java.io.IOException {
			        int opcion;
			        opcion = -1;
			        do {
			            out.println("---MENU PRINCIPAL---");
			            out.println("1. Ingresar números romanos");
			            out.println("Digite la opcion");
			            opcion = Integer.parseInt(in.readLine());
			            procesarOpcion(opcion);
			            out.println("La opcion ingresada fue: " + opcion);
			        } while (opcion != 9);
			    }
	
	public static void procesarOpcion(int pOpcion) throws IOException {
		
			        switch (pOpcion) {
		            case 1:
			            
			                break;
		
		
			            default:
			                out.println("Opción inválida");
			        }
	}
}

