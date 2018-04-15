package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Programa25 {
	public final static int MAX = 10;

	public static void main(String[] args) {
		int valor1 = obtenerenterovalido();
		System.out.println("resultado: " + valor1 * MAX);
	}

	public static int obtenerenterovalido() {
		int valori = MAX;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.println("Ingrese valor valido: ");
				valori = new Integer(entrada.readLine());
				System.out.println("int: " + valori);
			} catch (Exception exc) {
				System.out.println(exc);
			}
		} while (valori > MAX);
		return valori;
	}
}
