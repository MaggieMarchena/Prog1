package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico5a {

	public static void main(String[] args) {
		final int MIN = 0;
		int num = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
		try {
			System.out.println("Ingrese Número entero :");
			num = new Integer(entrada.readLine());
		}
		catch (Exception exc){
			System.out.println(exc);
		}
		while (num >= MIN){
			System.out.println(num);
			num--;
		}
	}

}
