package practicaCursada;

public class ProgramaPOO3 {

	public static void main(String[] args) {
		PuntoPOO3 p1 = new PuntoPOO3(1.0f, 1.0f);
		PuntoPOO3 p2 = new PuntoPOO3(2.0f, 1.0f);
		PuntoPOO3 p3 = new PuntoPOO3(1.0f, 3.0f);
		PoligonoPOO3 Pol = new PoligonoPOO3();
		Pol.agregarPunto(p1);
		Pol.agregarPunto(p2);
		Pol.agregarPunto(p3);
		Pol.imprimirPuntos();
	}
}
