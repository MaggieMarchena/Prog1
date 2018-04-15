package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Programa13 {
	public static void main(String[] args) {
		int numero = 0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese número: ");
			numero = new Integer(entrada.readLine());
		} catch (Exception exc) {
			System.out.println(exc);
		}
		if ((numero % 2) == 0) {
			System.out.println("Es múltiplo de 2");
		} else if (((numero % 3) == 0) && ((numero % 5) == 0)) {
			System.out.println("Es múltiplo de 3 y de 5");
		} else {
			System.out.println("No es múltiplo de 2, o de 3 y 5");
		}
	}
}