package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class EjercicioEntrega1 {
	public static void main(String[] args) {
		int entero1;
		int entero2;
		int entero3;
		int entero4;
		Locale.setDefault(new Locale("en", "US"));
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese primer número entero :");
			entero1 = new Integer(entrada.readLine());
			System.out.println("Ingrese segundo número entero :");
			entero2 = new Integer(entrada.readLine());
			System.out.println("Ingrese tercer número entero :");
			entero3 = new Integer(entrada.readLine());
			System.out.println("Ingrese cuarto número entero :)");
			entero4 = new Integer(entrada.readLine());
			System.out.println("Entero 1 : \t" + entero1);
			System.out.println("Entero 2 :" + entero2 + "\n\n");
			System.out.println("Enteros 3 y 4 :" + entero3 + "," + entero4);
		} 
		catch (Exception exc) {
			System.out.println(exc);
		}
	}
}