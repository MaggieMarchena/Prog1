package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Programa21 {
	public static void main(String[] args) {
		int valori;
		boolean valorvalido = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
			try { // try define un bloque de manejo de posibles excepciones u
					// errores
				System.out.println("Ingrese valor valido: ");
				valori = new Integer(entrada.readLine());
				System.out.println("int : " + valori);
				valorvalido = true;
			} catch (Exception exc) {
				System.out.println(exc);
				valorvalido = false;
			}
		} while (!valorvalido);
	}
}
