package practicaCursada;

public class EjParcial4 {
	public static final float VALOR = (float) 0.3;

	public static void main(String[] args) {
		int cont = 0;
		int resultado = contarMenores(cont);
		System.out.println("La cantidad es :" + resultado);
	}

	public static double obtenerNum() {
		double a = (double) 0;
		a = Math.random();
		return a;
	}

	public static boolean esMenor (float v, double a){
		if (a < v){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int contarMenores(int c){
		double num1 = obtenerNum();
		double num2 = obtenerNum();
		double num3 = obtenerNum();
		double num4 = obtenerNum();
		double num5 = obtenerNum();
		boolean resultado1 = esMenor(VALOR, num1);
		boolean resultado2 = esMenor(VALOR, num2);
		boolean resultado3 = esMenor(VALOR, num3);
		boolean resultado4 = esMenor(VALOR, num4);
		boolean resultado5 = esMenor(VALOR, num5);
		System.out.println("El núm es :" + num1);
		System.out.println("El núm es :" + num2);
		System.out.println("El núm es :" + num3);
		System.out.println("El núm es :" + num4);
		System.out.println("El núm es :" + num5);
		if (resultado1 == true){
			c++;
		}if (resultado2 == true){
			c++;
		}if (resultado3 == true){
			c++;
		}if (resultado4 == true){
			c++;
		}if (resultado5 == true){
			c++;
		}
		return c;
	}
	
}
