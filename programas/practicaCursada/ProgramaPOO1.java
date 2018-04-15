package practicaCursada;

public class ProgramaPOO1 {
	public static void main(String[] args) {
		PrecioPOO1 p; // Crea una referencia de la clase Precio
		p = new PrecioPOO1(); // Crea el objeto de la clase Precio
		p.pone(56.8); // Llamada al metodo pone
		// que asigna 56.8 al atributo euros
		System.out.println("Valor = " + p.da()); // Llamada al metodo da
		// que devuelve el valor de euros
		PrecioPOO1 q = new PrecioPOO1(); // Crea una referencia y el objeto
		q.euros = 75.6; // Asigna 75.6 al atributo euros
		System.out.println("Valor = " + q.euros);
	}
}
