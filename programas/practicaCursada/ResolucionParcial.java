package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ResolucionParcial {
	public static final int MAX = 50;

	public static void main(String[] args) {
		int i = 0;
		char opcion = obtenerOpcion();
		while ((i < MAX) && (opcion != 'a')){
			float val1 = obtenerFloat();
			float val2 = obtenerFloat();
			resolverOperaciones(opcion, val1, val2);
			i++;
		}
	}
	
	public static float obtenerFloat(){
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
		float a = (float)0.0;
		boolean floatValido = false;
		do {
			try {
				System.out.println("Ingrese el número float :");
				a = new Float (entrada.readLine());
				floatValido = true;
			}
			catch(NumberFormatException e){
				System.out.println("Número no válido");
				floatValido = false;
			}
			catch(Exception exc){
				System.out.println(exc);
				floatValido = false;
			}
		}
		while (!(floatValido));
		return a;
	}
	
	public static char obtenerOpcion(){
		char b = 'd';
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
		do {
			try {
				System.out.println("Ingrese su opción (a, b, c) :");
				b = (char)(entrada.readLine().charAt(0));
			}
			catch(Exception exc){
				System.out.println(exc);
			}
		}
		while ((b != 'a') && (b != 'b') && (b != 'c'));
		return b;
	}
	
	public static void resolverOperaciones (char a, float v1, float v2){
		if (a == 'b'){
			try {
				System.out.println(v1 * v2);
			}
			catch(Exception exc){
				System.out.println(exc);
			}
		}
		else {
			try {
				System.out.println((v2 - v1)/(v1 - 1));
			}
			catch (ArithmeticException e){
				System.out.println("División por 0");
			}
			catch(Exception exc){
				System.out.println(exc);
			}
		}
	}
}
