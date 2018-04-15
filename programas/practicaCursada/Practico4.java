package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico4 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3 = 0, numA = 0, numB = 0, numC = 0, num4 = 0, num5 = 0, num6 = 0;
		char letra = 'a';
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
			System.out.println("Ingrese N�mero :");
			num1 = new Integer(entrada.readLine());
		} catch (Exception exc){
			System.out.println(exc);
		}
		if (num1 > 0){
			System.out.println("Positivo");
		}else {
			System.out.println("Negativo");
		}
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
			System.out.println("Ingrese N�mero :");
			num2 = new Integer(entrada.readLine());
		}catch (Exception exc){
			System.out.println(exc);
		}
		if (num2 > 100){
			System.out.println("Grande");
		}else {
			System.out.println("Chico");
		}
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
			System.out.println("Ingrese un N�mero del 1 al 7 :");
			num3 = new Integer(entrada.readLine());
		}catch (Exception exc){
			System.out.println(exc);
		}
		switch (num3){
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Mi�rcoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("S�bado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default: System.out.println("Error");
		}
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
			System.out.println("Ingrese una letra (min�scula) :");
			letra = (char)(entrada.readLine().charAt(0));
		}catch (Exception exc){
			System.out.println(exc);
		}
		switch (letra){
		case 'a': case 'e': case 'i': case 'o': case 'u':
			System.out.println("Vocal");
			break;
		default: System.out.println("Consonante");
			break;
		}
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
			System.out.println("Ingrese primer Numero :");
			numA = new Integer(entrada.readLine());
			System.out.println("Ingrese segundo N�mero :");
			numB = new Integer(entrada.readLine());
			System.out.println("Ingrese tercer N�mero :");
			numC = new Integer(entrada.readLine());
		}catch (Exception exc){
			System.out.println(exc);
		}
		if ((numA < numB) && (numB < numC)){
			System.out.println("Creciente");
		}
		else if ((numA > numB) && (numB > numC)){
			System.out.println("Decreciente");
		}
		else {
			System.out.println("Error");
		}
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
			System.out.println("Ingrese primer N�mero :");
			num4 = new Integer(entrada.readLine());
			System.out.println("Ingrese segundo N�mero :");
			num5 = new Integer(entrada.readLine());
			System.out.println("Ingrese tercer N�mero :");
			num6 = new Integer(entrada.readLine());
		}catch (Exception exc){
			System.out.println(exc);
		}
		if ((num4 > num5) && (num4 > num6)){
			System.out.println("N�mero mayor: primer n�mero (" + num4 + ")");
		}
		else if ((num5 > num4) && (num5 > num6)){
			System.out.println("N�mero mayor: segundo n�mero (" + num5 + ")");
		}
		else {
			System.out.println("N�mero mayor: tercer n�mero (" + num6 + ")");
		}
	}
}
