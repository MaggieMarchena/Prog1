package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class Programa5 {
	public static void main(String[] args) {
		String nombre;
		int factura;
		String producto1;
		double precio1;
		String producto2;
		double precio2;
		Locale.setDefault(new Locale("en", "US"));
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese Apellido y Nombre del cliente (sin comas):");
			nombre = entrada.readLine();
			System.out.println ("Ingrese Núm. de factura :");
			factura = new Integer (entrada.readLine ());
			System.out.println("Ingrese nombre del Producto 1:");
			producto1 = entrada.readLine();
			System.out.println("Ingrese precio del Producto 1:");
			precio1 = new Double(entrada.readLine ());
			System.out.println("Ingrese nombre del Producto 2:");
			producto2 = entrada.readLine();
			System.out.println("Ingrese precio del Producto 2:");
			precio2 = new Double (entrada.readLine ());
			System.out.println("Apellido y Nombre : " + nombre);
			System.out.println ("Núm. de factura :" + factura);
			System.out.println("Producto 1 : " + producto1);
			System.out.println("Precio : " + precio1);
			System.out.println ("Producto 2 :" + producto2);
			System.out.println ("Precio : " + precio2);
		} 
		catch (Exception exc) {
			System.out.println(exc);
		}
	}
}