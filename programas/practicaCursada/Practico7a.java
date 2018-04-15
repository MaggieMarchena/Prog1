package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico7a {

	public static void main(String[] args) {
		int a = obtenerEnteroValido();
		int b = obtenerEnteroValido();
		int mayor = obtenerNumMayor(a, b);
		System.out.println("El Número mayor es : " + mayor);
	}
	public static int obtenerEnteroValido (){
		int i = 0;
		boolean enteroValido = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
		do {
			try {
				System.out.println("Ingrese Número : ");
				i = new Integer(entrada.readLine());
				enteroValido = true;
			}
			catch (NumberFormatException e){
				System.out.println("Número no válido");
				enteroValido = false;
			}
			catch (Exception exc){
				System.out.println(exc);
				enteroValido = false;
			}
		}
		while (!(enteroValido));
		return i;
	}
	public static int obtenerNumMayor (int a, int b){
		if (a > b){
			return a;
		}
		else {
			return b;
		}
	}
}
