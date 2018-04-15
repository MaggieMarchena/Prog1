package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Programa20 {
	public static void main(String[] args) {
		// DECLARACION DE VARIABLES
		int valori = 0;
		int resultado = 0;
		// CARGA DE DATOS
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.println("Ingrese integer entre 1 y 3: ");
				valori = new Integer(entrada.readLine());
			} catch (Exception exc) {
				System.out.println(exc);
			}
		} while (!((valori >= 1) && (valori <= 3)));
		// PROCESAR
		switch (valori) {
		case 1:
			resultado = 200;
			break;
		case 2:
			resultado = 300;
			break;
		case 3:
			resultado = 400;
			break;
		default:
			break;
		}
		// VISUALIZACION DE RESULTADOS
		System.out.println("El resultado es " + resultado);
	}
}