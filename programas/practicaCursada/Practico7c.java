package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico7c {

	public static void main(String[] args) {
		float n = obtenerNumPositivo();
		float m = obtenerNumPositivo();
		float promedio = obtenerPromedio(n,m);
		System.out.println("El promedio es : " + promedio);
	}
	public static float obtenerNumPositivo(){
		float i = (float)0.0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
		do {
			try {
				System.out.println("Ingrese N�mero Positivo :");
				i = new Float(entrada.readLine());
			}
			catch (NumberFormatException e){
				System.out.println("Formato de N�mero no v�lido");
			}
			catch (Exception exc){
				System.out.println(exc);
			}
		}
		while (!(i >= 0));
		return i;
	}
	public static float obtenerPromedio(float a, float b){
		return ((a + b) / 2);
	}
}
