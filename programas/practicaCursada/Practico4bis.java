package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico4bis {

	public static void main(String[] args) {
		int num = 0;
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Ingrese N�mero de mes :");
			num = new Integer(entrada.readLine());
		}catch (Exception exc){
			System.out.println(exc);
		}
		switch (num){
		case 2: System.out.println("28 d�as");
			break;
		case 4: case 6: case 9: case 11: System.out.println("30 d�as");
			break;
		default: System.out.println("31 d�as");
			break;
		}
	}

}
