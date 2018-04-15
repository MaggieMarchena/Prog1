package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico8b {
	final static int MAX = 10;
	final static int MAXIMO = 100;

	public static void main(String[] args) {
		int A[] = new int[MAX];
		cargarArreglo(A);
		ordenarArreglo(A);
		imprimirArreglo(A);
		int num = obtenerEntero();
		int pos = buscarPosicion_ord(A, num);
		if (pos == -1){
			System.out.println("No existe el valor dentro del arreglo");
		}
		else {
			System.out.println("La posicion es :" + pos);
		}
	}

	public static void cargarArreglo(int[] arr) {
		for (int pos = 0; pos < MAX; pos++)
			arr[pos] = (int) (Math.random() * MAXIMO + 1);
	}

	public static void imprimirArreglo(int[] arr) {
		System.out.println("Los números son :");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(" " + arr[pos]);
		}
		System.out.println("");
		
	}

	public static void ordenarArreglo (int [] arr){
		for (int i = 1; i < MAX; i++) {
				int aux = arr [i];
				int j = i - 1;
				while ((j >= 0) && (arr[j] > aux)){
					arr[j+1] = arr[j]; 
					j--;
				}
				arr[j+1] = aux; 
		}
	}
	
	public static int obtenerEntero(){
		int a = 0;
		boolean enteroValido = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
		do {
			try {
				System.out.println("Ingrese el valor :");
				a = new Integer (entrada.readLine());
				enteroValido = true;
			}
			catch (NumberFormatException e){
				System.out.println("Entero no válido");
				enteroValido = false;
			}
			catch (Exception exc){
				System.out.println(exc);
				enteroValido = false;
			}
		}
		while (!(enteroValido));
		return a;
	}
	
	public static int buscarPosicion_ord (int [] arr, int valor){
		int pos = 0;
		while ((pos < MAX) && (arr[pos] < valor)){
			pos++;
		}
		if ((pos < MAX) && (arr[pos] == valor)){
				return pos;
		}
		else {
			return -1;
		}
	}
}
