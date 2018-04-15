package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico3 {

	public static void main(String[] args) {
		int a, b;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese Núm. Entero 'a' :");
			a = new Integer(entrada.readLine());
			System.out.println("Ingrese Núm. Entero 'b' :");
			b = new Integer(entrada.readLine());
			System.out.println("a>b y ambos son múltiplo de 2 :" + ((a > b) && (a % 2 == 0) && (b % 2 == 0)));
		} catch (Exception exc) {
			System.out.println(exc);
		}

	}
}