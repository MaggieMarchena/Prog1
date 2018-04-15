package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class Programa3 {
	public static void main(String[] args) {
		String linea;
		float flotante;
		double doble_prec;
		int entero;
		char caracter;
		Locale.setDefault(new Locale("en", "US"));
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese string: ");
			linea = entrada.readLine();
			System.out.println("Ingrese float: ");
			flotante = new Float(entrada.readLine());
			System.out.println("Ingrese double: ");
			doble_prec = new Double(entrada.readLine());
			System.out.println("Ingrese int: ");
			entero = new Integer(entrada.readLine());
			System.out.println("Ingrese char: ");
			caracter = (char) (entrada.readLine().charAt(0));
			System.out.println("string : " + linea);
			System.out.println("float : " + flotante);
			System.out.println("double : " + doble_prec);
			System.out.println("int : " + entero);
			System.out.println("char : " + caracter);
		} 
		catch (Exception exc) {
			System.out.println(exc);
		}
	}
}