package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico5c {

	public static void main(String[] args) {
		final int MIN = 0;
		final int MAX = 999;
		int num = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un Número entre 0 y 999 :");
			num = new Integer(entrada.readLine());
		} catch (Exception exc) {
			System.out.println(exc);
		}
		while ((num > MIN) && (num <= MAX)) {
			if (num < 10) {
				System.out.println("1 cifra");
			} else if (num < 100) {
				System.out.println("2 cifras");
			} else {
				System.out.println("3 cifras " + num);
			}
		}
	}

}
