package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico7d {

	public static void main(String[] args) {
		float F = obtenerFloatValido();
		double C = transformarEnCelsius(F);
		System.out.println("Celsius :" + C);
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
	public static double transformarEnCelsius(float a){
		return ((a - 32)/1.8);
	}
}
