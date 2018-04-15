package practicaCursada;

//Sentencia for
public class Programa16 {
	public static void main(String[] args) {
		final int MAX = 10;
		final int MULTIPLO = 5;
		System.out.println("Tabla de multiplicar del " + MULTIPLO);
		// Se puede declarar o no la variable i dentro del inicio del for
		for (int i = 0; i <= MAX; i++) {
			System.out.println(MULTIPLO + " * " + i + " = " + MULTIPLO * i);
		}
	}
}
