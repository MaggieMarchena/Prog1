package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class Programa4 {
	public static void main(String[] args) {
		String linea1;
		String linea2;
		int entero;
		Locale.setDefault(new Locale("en", "US"));
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese Apellido y Nombre (sin comas): ");
			linea1 = entrada.readLine();
			System.out.println("Ingrese DNI (sin puntos): ");
			entero = new Integer(entrada.readLine());
			System.out.println("Ingrese ocupación: ");
			linea2 = entrada.readLine();
			System.out.println("Apellido y Nombre : " + linea1);
			System.out.println("DNI : " + entero);
			System.out.println("Ocupación : " + linea2);
		} 
		catch (Exception exc) {
			System.out.println(exc);
		}
	}
}
