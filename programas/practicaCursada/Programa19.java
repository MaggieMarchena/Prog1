package practicaCursada;

public class Programa19 {
	public static void main(String[] args) {
		final int MAX = 10;
		double cantidad = 100;
		double interes = 4;
		int anios = 1;
		do {
			cantidad += cantidad * interes / 100;
			anios++;
		} while (anios < MAX);
		System.out.println("La cantidad final es = " + cantidad);
	}
}