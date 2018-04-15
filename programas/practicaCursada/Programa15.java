package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Programa15 {
	public static void main(String[] args) {
		int numero = 0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese número: ");
			numero = new Integer(entrada.readLine());
		} catch (Exception exc) {
			System.out.println(exc);
		}
		switch (numero) {
		case 0:
			System.out.println("Es cero");
			break;
		case 1:
			System.out.println("Es uno");
			break;
		default:
			if (numero > 0) {
				System.out.println("Es positivo");
			} else {
				System.out.println("Es negativo");
				break;
			}
		}
	}
}