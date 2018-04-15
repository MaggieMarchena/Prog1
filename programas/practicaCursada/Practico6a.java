package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico6a {

	public static void main(String[] args) {
		int valori;
		boolean valorvalido = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
		do{
			try{
				System.out.println("Ingrese valor válido :");
				valori = new Integer(entrada.readLine());
				System.out.println("valor i :");
				System.out.println("Resultado de la raíz :" + Math.sqrt(valori));
				valorvalido = true;
			}
			catch (ArithmeticException e){
				System.out.println("0 division");
				valorvalido = false;
			}
			catch (Exception exc){
				System.out.println(exc);
				valorvalido = false;
			}
		}
		while (!(valorvalido));
	}

}
