package practicaCursada;

public class Programa18 {
	public static void main(String[] args) {
		final int MAX = 10;
		double cantidad = 100;
		double interes = 4;
		int anios = 1;
		while (anios < MAX) {
			cantidad += cantidad * interes / 100;
			anios++;
		}
		System.out.println("La cantidad final es = " + cantidad);
	}
}
