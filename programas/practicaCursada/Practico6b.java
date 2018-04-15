package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico6b {

	public static void main(String[] args) {
		int opcion = 1;
		boolean opcionvalido = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
		while (opcion != 0){
			do {
				try {
					System.out.println("Ingrese valor :");
					opcion = new Integer(entrada.readLine());
					System.out.println("Valor :" + opcion);
					opcionvalido = true;
				}
				catch(NumberFormatException e){
					System.out.println("Error");
					opcionvalido = false;
				}
				catch(Exception exc){
					System.out.println("Error");
					opcionvalido = false;
				}
			}
			while(!(opcionvalido));
		}
	}

}
