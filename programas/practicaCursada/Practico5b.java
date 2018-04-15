package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico5b {

	public static void main(String[] args) {
		final int MAX = 10;
		int num = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
		try {
			System.out.println("Ingrese Número entero :");
			num = new Integer(entrada.readLine());
		}
		catch (Exception exc){
			System.out.println(exc);
		}
		for (int i = 0; i <= MAX; i++){
			System.out.println(num + " * " + i + " = " + num*i);
		}
	}

}
