package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Programa26 {
	final static int MAX = 10;

	public static void main(String[] args) {
		char opcion = obteneropcionposible();
		int M = obtenerenterovalido ();
		int N = obtenerenterovalido ();
		int resultado = resolveroperaciones (opcion, N, M);
		System.out.println("Resultado = " + resultado);
	}

	public static char obteneropcionposible() {
		char valorc = ' ';
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		while (!((valorc == 'a') || (valorc == 'b'))) {
			try {
				System.out.println("Ingrese opcion: ");
				valorc = (char) (entrada.readLine().charAt(0));
				System.out.println("char: " + valorc);
			} catch (Exception exc) {
				System.out.println(exc);
			}
		}
		return valorc;
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

	public static int resolveroperaciones(char opcion, int valor1, int valor2) {
		if (opcion == 'a') {
			return valor1 + valor2;
		} else {
			return valor1 - valor2;
		}
	}
}
