package practicaCursada;

public class Programa24 {
	public static void main(String[] args) {
		int h = 5;
		tabla(h); // ejemplo de llamada, se puede poner tmb cualquier variable q haya definido antes como un entero (ej.:h)
		// sin return es igual que return al final
	}

	public static void tabla(int n) {
		System.out.println("Tabla del numero " + n);
		for (int i = 0; i <= 10; i++)
			System.out.println(n + " x " + i + " = " + producto(n, i));
		return; // No devuelve ningun valor
	}

	public static int producto(int a, int b) {
		return a * b;
	}
}
