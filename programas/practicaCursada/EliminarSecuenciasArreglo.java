package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EliminarSecuenciasArreglo {
	final static int MAX = 10;

	public static void main(String[] args) {
		int A[] = new int[MAX];
		cargarArreglo(A);
		imprimirArreglo(A);
		int N = obtenerEntero();
		int pos = 0;
		while (pos < MAX){
			int inicioSec = buscarInicSec(A, pos);
			if (inicioSec != -1){
				int largoSec = buscarLargoSec(A, inicioSec);
				int finalSec = inicioSec + largoSec - 1;
				if (largoSec == N){
					for (int i = inicioSec; i <= finalSec; i++){
						eliminarElemento (A, inicioSec);
					}
				}
				else {
					pos = finalSec;
				}
			}
			pos++;
		}
		imprimirArreglo(A);  
	}

	public static void cargarArreglo(int[] arr) {
		for (int pos = 0; pos < MAX; pos++) {
			System.out.println("Posición " + pos);
			arr[pos] = obtenerEntero();
		}
	}

	public static void imprimirArreglo(int[] arr) {
		System.out.println("Los números son :");
		for (int con = 0; con < MAX; con++)
			System.out.println(arr[con]);
	}


	public static int obtenerEntero() {
		int a = 0;
		boolean enteroValido = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.println("Ingrese el valor :");
				a = new Integer(entrada.readLine());
				enteroValido = true;
			} catch (NumberFormatException e) {
				System.out.println("Número no válido");
				enteroValido = false;
			} catch (Exception exc) {
				System.out.println(exc);
				enteroValido = false;
			}
		} while (!(enteroValido));
		return a;
	}

	public static int buscarInicSec(int[] arr, int p) {
		while ((p < MAX) && (arr[p] == 0)) {
			p++;
		}
		if ((p < MAX) && (arr[p] != 0)) {
			return p;
		} else {
			return -1;
		}
	}

	public static int buscarLargoSec(int[] arr, int in) {
		int pos = in;
		int cont = 0;
		while ((pos < MAX) && (arr[pos] != 0)) {
			pos++;
			cont++;
		}
		if ((pos < MAX) && (arr[pos] == 0)) {
			return cont;
		} else {
			return -1;
		}
	}
		
	public static void eliminarElemento(int [] arr, int pos){
		for (int i = pos; i < MAX - 1; i++){ 
			arr[i] = arr [i + 1]; 
		}
		arr[MAX - 1] = 0; 
	}
	
}