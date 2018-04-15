package practicaCursada;

public class PoligonoPOO3 {
	final static int MAXPUNTOS = 10;
	private PuntoPOO3[] puntos = new PuntoPOO3[MAXPUNTOS];
	private int cantPuntos = 0;

	public void agregarPunto(PuntoPOO3 xy) {
		puntos[cantPuntos] = xy;
		cantPuntos++;
	}

	public PuntoPOO3 getPunto(int pos) {
		return puntos[pos];
	}

	public void imprimirPuntos() {
		for (int i = 0; i < cantPuntos; i++)
			System.out.println("Punto " + i + " = (" + getPunto(i).getX() + "," + getPunto(i).getY() + ")");
	}
}
