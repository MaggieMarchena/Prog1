package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Programa22 {
	public static void main(String[] args) {
		int valorentero = 0;
		float valorfloat = (float) 0.0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.println("Ingrese integer: ");
				valorentero = new Integer(entrada.readLine());
				System.out.println("El resultado 1 es " + valorentero);
				System.out.println("El resultado 2 es " + 1 / valorentero);
				System.out.println("Ingrese float: ");
				valorfloat = Float.parseFloat(entrada.readLine());
				System.out.println("El resultado 3 es " + valorfloat);
			} catch (ArithmeticException e) {
				System.out.println("0 division");
				valorentero = 0;
				valorfloat = (float) 0.0;
			} catch (NumberFormatException e) {
				System.out.println("Invalid number");
				valorentero = 0;
				valorfloat = (float) 0.0;
			} catch (Exception exc) {
				System.out.println(exc);
				valorentero = 0;
				valorfloat = (float) 0.0;
			}
		} while ((valorfloat == (float) 0.0) && (valorentero == 0));
		System.out.println("Finalizado");
	}
}
