package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EjercicioEntrega3 {

	public static void main(String[] args) {
		int num = 0;
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Ingrese Número entero :");
			num = new Integer(entrada.readLine());
		}catch (Exception exc){
			System.out.println(exc);
		}
		if ((num > 0) && (num < 4600)){
			System.out.println("Corresponde a luz ultravioleta (UV)");
		}
		else if ((num >= 4600) && (num < 5000)){
			System.out.println("Corresponde a luz visible, color violeta");
		}
		else if ((num >= 5000) && (num < 5600)){
			System.out.println("Corresponde a luz visible, color azul");
		}
		else if ((num >= 5600) && (num < 5900)){
			System.out.println("Corresponde a luz visible, color verde");
		}
		else if ((num >= 5900) && (num < 6100)){
			System.out.println("Corresponde a luz visible, color amarillo");
		}
		else if ((num >= 6100) && (num < 6600)){
			System.out.println("Corresponde a luz visible, color ámbar");
		}
		else if ((num >= 6600) && (num < 7000)){
			System.out.println("Corresponde a luz visible, color rojo");
		}
		else if (num >= 7000){
			System.out.println("Corresponde a luz infrarrojo (IR)");
		}
		else {
			System.out.println("Error");
		}
	}

}
