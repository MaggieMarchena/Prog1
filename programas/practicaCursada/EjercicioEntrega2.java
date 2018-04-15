package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EjercicioEntrega2 {

	public static void main(String[] args) {
		int a;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese Núm. Entero 'a' :");
			a = new Integer(entrada.readLine());
			System.out.println("Es múltiplo de 3? :" + (a % 3 == 0));
			System.out.println("Es múltiplo de 6 y de 7? :" + ((a % 6 == 0) && (a % 7 == 0)));
			System.out.println("\t Es múltiplo de 6? :" + (a % 6 == 0));
			System.out.println("\t Es múltiplo de 7? :" + (a % 7 == 0));
			System.out.println("Es mayor a 30 y múltiplo de 2, ó menor igual a 30? :" + (((a > 30) && (a % 2 == 0)) || (a <= 30)));
			System.out.println("\t Es mayor a 30 y múltiplo de 2? :" + ((a > 30) && (a % 2 == 0)));
			System.out.println("\t Es menor igual a 30? :" + (a <= 30));
			System.out.println("El cociente de la división a/5 es mayor a 10? :" + (a / 5 > 10));
			System.out.println("\t Cociente :" + (a / 5) + "\t Resto :" + (a % 5));
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}

}
