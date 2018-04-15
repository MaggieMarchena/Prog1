package practicaCursada;

public class ProgramaPOO2 {
	public static void main(String[] args) {
		PrecioPOO2 p; 							// Crea una referencia de la clase Precio
		p = new PrecioPOO2(56.8);				 // Crea el objeto de la clase Precio
												// y le asigna 56.8 al atributo euros
		System.out.println("Valor = " + p.da()); // Llamada al metodo da
												// que devuelve el valor de euros
		PrecioPOO2 q = new PrecioPOO2(75.6);    // Crea el objeto de la clase
												// Precio y le asigna 75.6 al atributo euros
		System.out.println("Valor = " + q.euros);
	}
}