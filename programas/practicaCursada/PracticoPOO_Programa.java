package practicaCursada;

public class PracticoPOO_Programa {

	public static void main(String[] args) {
		PracticoPOO_Punto p1;
		p1 = new PracticoPOO_Punto(12.6, -3.8);
		System.out.println("Punto : (" + p1.x + "," + p1.y + ")");
		p1.x = 15.8;
		System.out.println("Punto : (" + p1.x + "," + p1.y + ")");
		System.out.println("Cuadrante :" + p1.obtenerCuadrante());
		System.out.println("Distancia al origen :" + p1.obtenerDistanciaAOrigen());
		p1.moverACuad1();
		System.out.println("Cuadrante :" + p1.obtenerCuadrante());
	}

}
