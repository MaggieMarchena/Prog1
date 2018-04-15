package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EjParcial1 {
	public static final int MAX = 3;

	public static void main(String[] args) {
		double x = obtenerNumValido();
		double resultado = calcularFuncion(x);
		while (!(x == -1)){
			while (!(resultado == MAX)) {
				System.out.println("Resultado de la funci�n :" + resultado);
				System.out.println("No se alcanz� el m�ximo de la funci�n con x = " + x);
			}
		}
	}
	public static double obtenerNumValido() {
		double a = 0;
		boolean numValido = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.println("Ingrese N�mero v�lido :");
				a = new Double(entrada.readLine());
				numValido = true;
			}
			catch (NumberFormatException e){
				System.out.println("N�mero no v�lido");
				numValido = false;
			}
			catch (Exception exc){
				System.out.println(exc);
				numValido = false;
			}
		}
		while (!(numValido));
		return a;
	}
	
	public static double calcularFuncion(double j) {
		double i = 0;
		i = (3 * (Math.cos(Math.toRadians(2 * Math.PI * j))));
		return i;
	}
}
