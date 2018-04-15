package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico7b {

	public static void main(String[] args) {
		float n = obtenerFloatValido();
		float m = obtenerFloatValido();
		int veces = obtenerEnteroValido();
		float potencia = obtenerProducto(n,m,veces);
		System.out.println("La potencia es : " + potencia);
	}
	public static float obtenerFloatValido(){
		float i = (float)0.0;
		boolean floatValido = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
		do {
			try {
				System.out.println("Ingrese Número : ");
				i = new Float(entrada.readLine());
				floatValido = true;
			}
			catch (NumberFormatException e){
				System.out.println("Float no válido");
				floatValido = false;
			}
			catch (Exception exc){
				System.out.println(exc);
				floatValido = false;
			}
		}
		while (!(floatValido));
		return i;
	}
	public static int obtenerEnteroValido(){
		int i = 0;
		boolean enteroValido = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
		do {
			try {
				System.out.println("Ingrese cantidad de veces que debe multiplicarse :");
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
	public static float obtenerProducto (float a, float b, int veces){
		return a * b * veces;
	}
}
