package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PracticoArr8 {
	final static int MAX = 10;

	public static void main(String[] args) {
		//int A[] = new int[MAX];
		//cargarArreglo(A);
		int[] Arreglo = {0,0,5,9,4,0,0,1,9,0};
		imprimirArreglo(Arreglo);
		int pos = 0;
		while (pos < MAX){
			int inicioSec = buscarInicSec(Arreglo, pos);
			if (inicioSec != -1){
				int largoSec = buscarLargoSec(Arreglo, inicioSec);
				int finalSec = inicioSec + largoSec - 1;
				System.out.println("Inicio : " + inicioSec + "\nFinal : " + finalSec);
				pos = finalSec;
			}
			pos++;
		}
	}

	public static void cargarArreglo(int[] arr) {
		for (int pos = 0; pos < MAX; pos++) {
			System.out.println("Posición " + pos);
			arr[pos] = obtenerEntero();
		}
	}

	public static void imprimirArreglo(int[] arr) {
		System.out.println("Los números son :");
		for (int con = 0; con < MAX; con++){
			System.out.print(" " + arr[con]);
		}
		System.out.println("");
	}

	public static void ordenarArreglo(int[] arr) {
		for (int i = 1; i < MAX; i++) {
			int aux = arr[i];
			int j = i - 1;
			while ((j >= 0) && (arr[j] > aux)) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = aux;
		}
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
		while ((pos < MAX) && (arr[pos] != 0)) {
			pos++;
		}
		return pos - in;
	}
		
}