package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class EjercicioEntrega4 {

	public static void main(String[] args) {
		char operacion = 'e';
		float N = (float)0.0, M = (float)0.0;
		boolean Nvalido = false;
		boolean Mvalido = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
		Locale.setDefault(new Locale("en", "US")); 
		do {
			try {
				System.out.println("Ingrese caracter válido ('a', 'b', 'c', 'd') :");
				operacion = (char)(entrada.readLine().charAt(0));
				switch (operacion){
				case 'a': System.out.println("Suma"); break;
				case 'b': System.out.println("Resta"); break;
				case 'c': System.out.println("Multiplicación"); break;
				case 'd': System.out.println("División"); break;
				default: System.out.println("Error"); break;
				}
			}
			catch (Exception exc){
				System.out.println(exc);
			}
		}
		while (!((operacion == 'a' ) || (operacion == 'b') || (operacion == 'c') || (operacion == 'd')));
		do {
			do {
				try {
					System.out.println("Ingrese float N :");
					N = new Float(entrada.readLine());
					System.out.println("N = " + N);
					Nvalido = true;
				}
				catch (NumberFormatException e){
					System.out.println("Float no válido");
					N = (float)0.0;
					Nvalido = false;
				}
				catch (Exception exc){
					System.out.println(exc);
					Nvalido = false;
				}
			}
			while (!(Nvalido));
			do {
				try {
					System.out.println("Ingrese float M :");
					M = new Float(entrada.readLine());
					System.out.println("M = " + M);
					Mvalido = true;
				}
				catch (NumberFormatException e){
					System.out.println("Float no válido");
					Mvalido = false;
				}
				catch (Exception exc){
					System.out.println(exc);
					Mvalido = false;
				}
			}
			while (!(Mvalido));
			try {
				switch (operacion){
				case 'a': System.out.println(N + " + " + M + " = " + (N+M)); break;
				case 'b': System.out.println(N + " - " + M + " = " + (N-M)); break;
				case 'c': System.out.println(N + " * " + M + " = " + (N*M)); break;
				case 'd': System.out.println(N + " / " + M + " = " + (N/M)); break; // Estuve investigando un poco y para float y double esta definido el infinito para divisiones por 0 por el standard IEEE 754, por lo que no toma el error en la excepcion del catch.
				}
			}
			catch (ArithmeticException e){
				System.out.println("División por 0");
				M = (float)0.0;
			}
			catch (Exception exc){
				System.out.println(exc);
				M = (float)0.0;
			}
		}
		while (M == (float)0.0);
		}
}
