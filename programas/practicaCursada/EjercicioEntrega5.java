package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EjercicioEntrega5 {

	public static void main(String[] args) {
		char opcion = obtenerOpcionPosible();
		float valor1 = obtenerFloatValido();
		float valor2 = obtenerFloatValido();
		float valor3 = obtenerFloatValido();
		double resultado = resolverOperaciones(opcion, valor1, valor2, valor3);
		System.out.println("Resultado :" + resultado);
		
	}
		public static char obtenerOpcionPosible(){
			char i = 5;
			BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
			do {
				try {
					System.out.println("Ingrese opción (0,1,2,3)");
					i = (char)(entrada.readLine().charAt(0));
					switch (i){
						case '0': System.out.println("Raíz cuadrada de la resta entre valor1 y valor3"); break;
						case '1': System.out.println("Promedio de valor1, valor2 y valor3"); break;
						case '2': System.out.println("Función EquacionMat ((Raíz de(valor1 - valor3))/valor2)"); break;
						case '3': System.out.println("Cociente entre promedio de los valores y EquacionMat ((Raíz de(valor1 - valor3))/valor2)"); break;
					}
				}
				catch(Exception exc){
					System.out.println(exc);
				}
			}
			while (!((i == '0') || (i == '1') || (i == '2') || (i == '3')));
			return i;
		}
		public static float obtenerFloatValido(){
			float a = (float)0.0;
			boolean floatValido = false;
			BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
			do {
				try {
					System.out.println("Ingrese float positivo :");
					a = new Float(entrada.readLine());
					System.out.println("Float :" + a);
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
			while (!(floatValido) && (a >= 0));
			return a;
		}
		public static double calcularRaizDeResta(float a, float b){
			double c = (double)0.00;
			try {
				c = (Math.sqrt(a - b));
			}
			catch (ArithmeticException e){
				System.out.println("Raíz de Núm. negativo");
			}
			catch (Exception exc){
				System.out.println(exc);
			}
			return c;
		}
		public static double obtenerPromedio(float a, float b, float c){
			return ((a + b + c) / 3);
		}
		public static double EquacionMat(float v1, float v2, float v3){
			double a = (double)0.00;
			try {
				a = ((Math.sqrt(v1 - v3)) / v2);
			}
			catch (ArithmeticException e){
				System.out.println("Raíz de Núm. negativo ó División por 0");
			}
			catch (Exception exc){
				System.out.println(exc);
			}
			return a;
		}
		public static double resolverOperaciones(char a, float b, float c, float d){
			if (a == '0'){
				return calcularRaizDeResta(b, d);
			}
			else if (a == '1'){
				return obtenerPromedio(b, c, d);
			}
			else if (a == '2'){
				return EquacionMat(b, b, c);
			}
			else {
				System.out.println("Cociente de (" + obtenerPromedio(b, c, d) + ") y (" + EquacionMat(b, b, c) + ")");
				return (obtenerPromedio(b, c, d)) / (EquacionMat(b, b, c));
			}
		}
}
