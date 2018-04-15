package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico8c {
	final static int MAX = 10;
	final static int MAXIMO = 100;

	public static void main(String[] args) {
		int A[] = new int[MAX];
		cargarArreglo(A);
		ordenarArreglo(A);
		imprimirArreglo(A);
		int valor = obtenerEntero();
		int posicion = buscarPosicion_ord(A, valor);
		corrimientoDer(A, posicion);
		imprimirArreglo(A);
	}

	public static void cargarArreglo(int[] arr) {
		for (int con = 0; con < MAX; con++)
			arr[con] = (int) (Math.random() * MAXIMO + 1);
	}

	public static void imprimirArreglo(int[] arr) {
		System.out.println("Los números son :");
		for (int con = 0; con < MAX; con++)
			System.out.println(arr[con]);
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
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.println("Ingrese el valor :");
				a = new Integer(entrada.readLine());
				enteroValido = true;
			}
			catch(NumberFormatException e){
				System.out.println("Número no válido");
				enteroValido = false;
			}
			catch(Exception exc){
				System.out.println(exc);
				enteroValido = false;
			}
		}
		while (!(enteroValido));
		return a;
	}
	
	public static int buscarPosicion_ord (int [] arr, int v){
		int pos = 0;
		while ((pos < MAX) && (arr[pos] < v)){
			pos++;
		}
		if ((pos< MAX) && (arr[pos] == v)){
				return pos;
		}
		else {
			return -1;
		}
	}
	
	public static void corrimientoDer(int [] arr, int pos){
		for (int i = MAX - 1; i > pos; i--){ 
			arr[i] = arr [i - 1]; 
		}
		arr[pos] = 0;
	}
}
	